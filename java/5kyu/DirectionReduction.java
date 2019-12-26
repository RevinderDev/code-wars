import java.util.Stack;

public class DirReduction {
  private enum Direction{

	    NORTH("\"NORTH\""),
	    WEST("\"WEST\""),
	    EAST("\"EAST\""),
	    SOUTH("\"SOUTH\"");

        Direction(String s) {

        }
    }
    
     public static boolean checkRedundancy(Direction one, Direction two)
    {
        switch(one) {
            case WEST:
                if(two.equals(Direction.EAST))
                    return true;
                break;
            case EAST:
                if(two.equals(Direction.WEST))
                    return true;
                break;
            case NORTH:
                if(two.equals(Direction.SOUTH))
                    return true;
                break;
            case SOUTH:
                if(two.equals(Direction.NORTH))
                    return true;
                break;

        }
        return false;
    }
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        Stack<String> currentDirections = new Stack<>();
        for(int i = 0 ; i < arr.length ; ++i)
        {
            if(!currentDirections.empty()) {
                if (checkRedundancy(Direction.valueOf(currentDirections.peek()), Direction.valueOf(arr[i])))
                    currentDirections.pop();
                else
                    currentDirections.push(arr[i]);
            }
            else
                currentDirections.push(arr[i]);
        }
        return currentDirections.toArray(new String[]{});
        }
    
}