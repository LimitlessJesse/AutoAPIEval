import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.CompiledScript;

public class CompiledScript_1 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        CompiledScript script = ((javax.script.CompiledScript) engine).compile("var x = 10; var y = 20; x + y;");
        Object result = script.eval();
        
        System.out.println("Result: " + result);
    }
}
