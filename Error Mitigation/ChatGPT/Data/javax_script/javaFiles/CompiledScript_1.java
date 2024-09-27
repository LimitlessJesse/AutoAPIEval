import javax.script.*;

public class CompiledScript_1 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        CompiledScript compiledScript = ((Compilable) engine).compile("var x = 10; var y = 20; x + y;");
        Object result = compiledScript.eval();
        
        System.out.println("Result: " + result);
    }
}
