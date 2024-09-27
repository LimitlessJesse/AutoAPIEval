import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_1 {
    public static void main(String[] args) {
        ScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "John", ScriptContext.ENGINE_SCOPE);
        Object attribute = context.getAttribute("name");
        System.out.println(attribute);
    }
}
