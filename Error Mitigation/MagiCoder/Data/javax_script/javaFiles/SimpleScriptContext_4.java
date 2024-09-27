import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_4 {
    public static void main(String[] args) {
        ScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "John", ScriptContext.ENGINE_SCOPE);
        System.out.println(context.getAttribute("name")); // Output: John
        context.removeAttribute("name", ScriptContext.ENGINE_SCOPE);
        System.out.println(context.getAttribute("name")); // Output: null
    }
}
