import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.CompiledScript;

public class CompiledScript_4 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            CompiledScript script = engine.compile("function add(a, b) { return a + b; }");
            Object result = script.eval();
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
