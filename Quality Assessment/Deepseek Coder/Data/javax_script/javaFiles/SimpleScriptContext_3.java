import javax.script.SimpleScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_3 {
    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        SimpleScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "World", ScriptContext.ENGINE_SCOPE);
        try {
            engine.eval("print('Hello'+ name)", context);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(context.getAttribute("name"));
    }
}
