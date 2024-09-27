import javax.script.Bindings;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_2 {
    public static void main(String[] args) {
        SimpleScriptContext context = new SimpleScriptContext();
        Bindings bindings = context.getBindings(SimpleScriptContext.ENGINE_SCOPE);
        bindings.put("name", "John");
        
        System.out.println(bindings.get("name"));
    }
}
