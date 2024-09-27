import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CompiledScript_3 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            CompiledScript script = engine.compile("function add(a, b) { return a + b; }");
            Bindings bindings = engine.createBindings();
            bindings.put("a", 10);
            bindings.put("b", 20);

            Object result = script.eval(bindings);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
