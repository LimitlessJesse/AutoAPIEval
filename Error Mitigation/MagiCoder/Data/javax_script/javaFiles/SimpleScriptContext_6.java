import javax.script.SimpleScriptContext;

public class SimpleScriptContext_6 {
    public static void main(String[] args) {
        SimpleScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "John", SimpleScriptContext.ENGINE_SCOPE);
    }
}
