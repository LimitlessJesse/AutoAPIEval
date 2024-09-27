import javax.script.SimpleScriptContext;

public class SimpleScriptContext_4 {
    public static void main(String[] args) {
        SimpleScriptContext context = new SimpleScriptContext();
        context.setAttribute("testAttribute", "Hello", SimpleScriptContext.ENGINE_SCOPE);
        
        Object attribute = context.getAttribute("testAttribute", SimpleScriptContext.ENGINE_SCOPE);
        System.out.println(attribute);
    }
}
