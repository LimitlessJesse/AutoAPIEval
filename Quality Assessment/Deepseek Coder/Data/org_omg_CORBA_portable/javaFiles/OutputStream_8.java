import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_8 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream out = outputStream._write_out();
        byte b = (byte) 65; // ASCII value of 'A'
        out.write_octet(b);
        System.out.println(outputStream.toString());
    }
}
