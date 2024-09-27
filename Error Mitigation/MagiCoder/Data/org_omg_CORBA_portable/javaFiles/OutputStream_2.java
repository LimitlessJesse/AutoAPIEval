import org.omg.CORBA.portable.OutputStream;
import java.io.IOException;

public class OutputStream_2 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write_char(char c) {
                try {
                    write(c);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void write_short(short s) {
                // Implement the rest of the methods
            }

            @Override
            public void write_long(long l) {
                // Implement the rest of the methods
            }

            // Implement the rest of the methods
        };

        outputStream.write_char('A');
    }
}
