import javax.script.AbstractScriptEngine;
import javax.script.ScriptException;

public class AbstractScriptEngine_3 {
    public static void main(String[] args) {
        AbstractScriptEngine engine = new AbstractScriptEngine() {
            @Override
            public Object eval(String script) throws ScriptException {
                // Implementation of eval method
                return null;
            }

            @Override
            public Object eval(Reader reader) throws ScriptException {
                // Implementation of eval method
                return null;
            }
        };

        try {
            Object result = engine.eval("1 + 2");
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
