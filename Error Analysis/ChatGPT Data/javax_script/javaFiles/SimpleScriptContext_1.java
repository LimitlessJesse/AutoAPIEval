import javax.script.Bindings;
import javax.script.SimpleBindings;
import javax.script.SimpleScriptContext;

public class SimpleScriptContext_1 {
    public static void main(String[] args) {
        // Creating a SimpleScriptContext
        SimpleScriptContext scriptContext = new SimpleScriptContext();

        // Creating a Bindings object
        Bindings bindings = new SimpleBindings();
        bindings.put("key", "value");

        // Setting the Bindings to the ENGINE_SCOPE (global scope)
        scriptContext.setBindings(bindings, SimpleScriptContext.ENGINE_SCOPE);

        // Retrieving the value from the bindings
        System.out.println(scriptContext.getAttribute("key"));

        // Setting the Bindings to the NAMESPACE_SCOPE
        scriptContext.setBindings(bindings, SimpleScriptContext.ENGINE_SCOPE);

        // Retrieving the value from the bindings
        System.out.println(scriptContext.getAttribute("key"));
    }
}
