import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream out = new OutputStream() {
            @Override
            public void write_short(short s) {
                try {
                    outputStream.write(s);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Other methods are not implemented here
        };

        out.write_short((short) 123);
        System.out.println(outputStream.toByteArray());
    }
}
