import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_7 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = new OutputStream() {
            @Override
            public void write_double(double d) {
                // Implementation of write_double method
            }
        };
        os.write_double(1.23);
    }
}
