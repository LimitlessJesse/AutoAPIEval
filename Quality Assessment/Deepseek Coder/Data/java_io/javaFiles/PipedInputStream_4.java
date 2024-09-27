import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_4 {
    public static void main(String[] args) {
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();

        try {
            outputStream.connect(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    outputStream.write("Hello, World!".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        byte[] buffer = new byte[1024];
        try {
            int read = inputStream.read(buffer);
            System.out.println(new String(buffer, 0, read));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
