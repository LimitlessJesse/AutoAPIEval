import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReader_1 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader();
            writer.connect(reader);

            new Thread(() -> {
                try {
                    writer.write("Hello, World!");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            int data;
            while ((data = reader.read())!= -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
