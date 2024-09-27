import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream out = new OutputStream() {
            @Override
            public void write_boolean(boolean b) {
                try {
                    outputStream.write(b? 1 : 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Other methods are not implemented here
        };

        out.write_boolean(true);
        out.write_boolean(false);

        byte[] bytes = outputStream.toByteArray();
        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}
