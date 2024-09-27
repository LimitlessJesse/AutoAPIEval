import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader_5 {
    public static void main(String[] args) {
        try {
            LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader("example.txt")));
            reader.mark(100); // Mark the present position in the stream
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.reset(); // Reset the stream to the marked position
            System.out.println("\nResetting to marked position...");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
