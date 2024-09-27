import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_7 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream outputStream = baos.getOutputStream();

        char character = 'A';
        outputStream.write_char(character);

        String result = baos.toString();
        System.out.println(result);
    }
}
