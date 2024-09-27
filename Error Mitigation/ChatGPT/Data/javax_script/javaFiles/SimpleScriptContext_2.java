import javax.script.SimpleScriptContext;

public class SimpleScriptContext_2 {
    public static void main(String[] args) {
        SimpleScriptContext context = new SimpleScriptContext();
        context.setAttribute("name", "John", SimpleScriptContext.ENGINE_SCOPE);
        
        Object attributeValue = context.getAttribute("name");
        System.out.println("Attribute value: " + attributeValue);
    }
}
