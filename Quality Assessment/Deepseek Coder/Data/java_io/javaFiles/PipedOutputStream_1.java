import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutputStream_1 {
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        try {
            pos.connect(pis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pos.write("Hello, World!".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = pis.read();
                    while (data!= -1) {
                        System.out.print((char) data);
                        data = pis.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
