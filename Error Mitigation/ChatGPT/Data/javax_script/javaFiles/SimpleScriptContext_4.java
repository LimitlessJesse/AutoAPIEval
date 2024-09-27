import javax.script.SimpleScriptContext;
import java.io.StringWriter;
import java.io.Writer;

public class SimpleScriptContext_4 {
    public static void main(String[] args) {
        SimpleScriptContext scriptContext = new SimpleScriptContext();
        
        // Create a new StringWriter
        StringWriter stringWriter = new StringWriter();
        
        // Set the StringWriter as the Writer for the script context
        scriptContext.setWriter(stringWriter);
        
        // Test output
        System.out.println("Hello, World!");
        System.out.println("Output from script: " + stringWriter.toString());
    }
}
