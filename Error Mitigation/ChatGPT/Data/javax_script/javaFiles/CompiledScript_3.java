import javax.script.*;

public class CompiledScript_3 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        CompiledScript compiledScript = ((Compilable) engine).compile("var x = 10; var y = 20; x + y;");
        ScriptContext context = new SimpleScriptContext();
        
        Object result = compiledScript.eval(context);
        System.out.println("Result: " + result);
    }
}
