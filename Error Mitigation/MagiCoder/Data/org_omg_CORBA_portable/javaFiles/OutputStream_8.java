import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_8 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = new OutputStream(baos);
        os.write_longlong(1234567890L);
        System.out.println(baos.toByteArray());
    }
}
