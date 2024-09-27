import javax.script.SimpleScriptContext;
import java.io.StringWriter;
import java.io.Writer;

public class SimpleScriptContext_5 {
    public static void main(String[] args) {
        SimpleScriptContext scriptContext = new SimpleScriptContext();
        
        // Create a StringWriter to use as the error output
        StringWriter errorOutput = new StringWriter();
        
        // Set the error writer to the StringWriter
        scriptContext.setErrorWriter(errorOutput);
        
        // Test error output
        scriptContext.getErrorWriter().write("Error message");
        
        // Display the error output
        System.out.println(errorOutput.toString());
    }
}
