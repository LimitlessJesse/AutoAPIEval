import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream out = outputStream._write_boolean(true);
        System.out.println(outputStream.toString());
    }
}
