import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator {

        public static Double evaluate(String expression){
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            try{
                Object ret = engine.eval(expression);
                return new Double(ret.toString());
            }
            catch (ScriptException e)
            {
                return null;
            }
        }

}
