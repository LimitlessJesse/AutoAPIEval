import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriter_1 {
    public static void main(String[] args) {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();

        // Connect the writer with the reader
        try {
            out.connect(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a new thread to write data
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    out.write("Hello, World!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the thread
        thread.start();

        // Read data from the reader
        try {
            int data = in.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
