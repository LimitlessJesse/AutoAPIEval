import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;

public class OutputStreamWriter_3 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        byte[] bytes = str.getBytes();
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                System.out.write(b);
            }
        };
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        try {
            writer.write(new String(bytes), 0, bytes.length);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
