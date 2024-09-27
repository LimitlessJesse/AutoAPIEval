import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_1 {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        try {
            pipedInputStream.connect(pipedOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                pipedOutputStream.write("Hello, World!".getBytes());
                pipedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        int data;
        try {
            while ((data = pipedInputStream.read())!= -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
