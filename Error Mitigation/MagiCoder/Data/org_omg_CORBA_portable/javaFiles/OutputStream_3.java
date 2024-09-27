import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream output = (OutputStream) outputStream;
        output.write_octet((byte) 100);
        System.out.println(outputStream.toByteArray()[0]);
    }
}
