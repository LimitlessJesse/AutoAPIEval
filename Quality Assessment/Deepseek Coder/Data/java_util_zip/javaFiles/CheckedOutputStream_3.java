import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.CRC32;

public class CheckedOutputStream_3 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();

        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                System.out.write(b);
            }
        };

        CheckedOutputStream cos = new CheckedOutputStream(outputStream, new CRC32());

        try {
            cos.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
