import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_9 {
    public static void main(String[] args) {
        // Create an instance of OutputStream
        OutputStream outputStream = new ByteArrayOutputStream();
        
        // Write a string to the output stream
        String s = "Hello, CORBA!";
        outputStream.write_string(s);
        
        // Print the written string
        System.out.println(outputStream.toString());
    }
}
