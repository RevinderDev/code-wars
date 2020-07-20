public class TCP {

    public static String traverseStates(String[] events) {
        State initialState = State.CLOSED;
        for (String event: events) {
            initialState = initialState.getNextState(event);
            if(initialState == null)
                return "ERROR";
        }
        return initialState.toString();
    }


    public enum State {
        CLOSED{
            @Override
            public State getNextState(String event)
            {
                switch(Event.valueOf(event))
                {
                    case APP_ACTIVE_OPEN:
                        return State.SYN_SENT;
                    case APP_PASSIVE_OPEN:
                        return State.LISTEN;
                    default:
                        return null;
                }
            }
        },
        SYN_SENT{
            @Override
            public State getNextState(String event) {
                switch(Event.valueOf(event))
                {
                    case RCV_SYN:
                        return State.SYN_RCVD;
                    case RCV_SYN_ACK:
                        return State.ESTABLISHED;
                    case APP_CLOSE:
                        return State.CLOSED;
                    default:
                        return null;
                }
            }
        },
        SYN_RCVD{
            @Override
            public State getNextState(String event) {
                switch(Event.valueOf(event))
                {
                    case APP_CLOSE:
                        return State.FIN_WAIT_1;
                    case RCV_ACK:
                        return State.ESTABLISHED;
                    default:
                        return null;
                }
            }
        },
        ESTABLISHED{
            @Override
            public State getNextState(String event) {
                switch(Event.valueOf(event))
                {
                    case APP_CLOSE:
                        return State.FIN_WAIT_1;
                    case RCV_FIN:
                        return State.CLOSE_WAIT;
                    default:
                        return null;
                }
            }
        },
        FIN_WAIT_1{
            @Override
            public State getNextState(String event) {
                switch(Event.valueOf(event))
                {
                    case RCV_FIN:
                        return State.CLOSING;
                    case RCV_FIN_ACK:
                        return State.TIME_WAIT;
                    case RCV_ACK:
                        return State.FIN_WAIT_2;
                    default:
                        return null;
                }
            }
        },
        CLOSING{
            @Override
            public State getNextState(String event) {
                return Event.valueOf(event).equals(Event.RCV_ACK) ? State.TIME_WAIT : null;
            }
        },
        FIN_WAIT_2{
            @Override
            public State getNextState(String event) {
                return Event.valueOf(event).equals(Event.RCV_FIN) ? State.TIME_WAIT : null;
            }
        },
        TIME_WAIT{
            @Override
            public State getNextState(String event) {
                return Event.valueOf(event).equals(Event.APP_TIMEOUT) ? State.CLOSED : null;
            }
        },
        CLOSE_WAIT{
            @Override
            public State getNextState(String event) {
                return Event.valueOf(event).equals(Event.APP_CLOSE) ? State.LAST_ACK : null;
            }
        },
        LAST_ACK{
            @Override
            public State getNextState(String event) {
                return Event.valueOf(event).equals(Event.RCV_ACK) ? State.CLOSED : null;
            }
        },
        LISTEN{
            @Override
            public State getNextState(String event)
            {
                switch(Event.valueOf(event))
                {
                    case RCV_SYN:
                        return State.SYN_RCVD;
                    case APP_SEND:
                        return State.SYN_SENT;
                    case APP_CLOSE:
                        return State.CLOSED;
                    default:
                        return null;
                }
            }
        };

        public abstract State getNextState(String event);
    }

    public enum Event{
        APP_PASSIVE_OPEN, APP_ACTIVE_OPEN,
        APP_SEND, APP_CLOSE, APP_TIMEOUT,
        RCV_SYN, RCV_ACK, RCV_SYN_ACK,
        RCV_FIN, RCV_FIN_ACK
    }
}
