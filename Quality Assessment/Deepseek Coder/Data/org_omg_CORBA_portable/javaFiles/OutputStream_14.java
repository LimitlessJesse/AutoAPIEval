import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;

public class OutputStream_14 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream outputStream = baos.getOutputStream();

        String s = "Hello, World!";

        // Get the write_wstring method from the OutputStream class
        Class<?> outputStreamClass = outputStream.getClass();
        Method writeWstringMethod = outputStreamClass.getDeclaredMethod("write_wstring", String.class);

        // Invoke the write_wstring method
        writeWstringMethod.invoke(outputStream, s);

        // Print the output
        System.out.println(baos.toString());
    }
}
