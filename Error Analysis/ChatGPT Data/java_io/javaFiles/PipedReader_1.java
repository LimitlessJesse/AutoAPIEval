import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReader_1 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader();

            // Connect the writer to the reader
            reader.connect(writer);

            // Write data to the writer
            writer.write("Hello, World!");

            // Read data from the reader
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            // Close the writer and reader
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
