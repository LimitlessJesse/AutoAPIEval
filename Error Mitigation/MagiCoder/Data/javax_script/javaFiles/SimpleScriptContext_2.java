import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_2 {
    public static void main(String[] args) {
        SimpleScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "John", ScriptContext.ENGINE_SCOPE);
        Object attribute = context.getAttribute("name", ScriptContext.ENGINE_SCOPE);
        System.out.println(attribute);
    }
}
