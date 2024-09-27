import javax.script.AbstractScriptEngine;
import javax.script.ScriptException;
import javax.script.Bindings;
import java.io.StringReader;

public class AbstractScriptEngine_4 {
    public static void main(String[] args) {
        AbstractScriptEngine scriptEngine = new AbstractScriptEngine() {
            @Override
            public Object eval(Reader reader, Bindings bindings) throws ScriptException {
                // Implementation of eval method
                return null;
            }
        };

        String script = "print('Hello, World!')";
        Bindings bindings = scriptEngine.createBindings();
        bindings.put("name", "John");

        try {
            scriptEngine.eval(new StringReader(script), bindings);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
