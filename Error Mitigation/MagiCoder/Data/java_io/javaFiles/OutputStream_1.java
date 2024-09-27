import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_1 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    System.out.write(b);
                }
            };
            outputStream.write('H');
            outputStream.write('i');
            outputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
