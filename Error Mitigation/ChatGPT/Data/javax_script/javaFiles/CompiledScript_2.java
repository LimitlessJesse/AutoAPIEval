import javax.script.*;

public class CompiledScript_2 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        CompiledScript compiledScript = ((Compilable) engine).compile("var x = 10; x * 2;");
        Bindings bindings = engine.createBindings();
        
        Object result = compiledScript.eval(bindings);
        System.out.println("Result: " + result);
    }
}
