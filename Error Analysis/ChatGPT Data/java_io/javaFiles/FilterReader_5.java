import java.io.FilterReader;
import java.io.StringReader;
import java.io.IOException;

public class FilterReader_5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        FilterReader reader = new FilterReader(new StringReader(text));

        try {
            reader.mark(5); // Mark the current position with readAheadLimit of 5
            int data = reader.read(); // Read the next character
            System.out.println((char) data); // Output: H
            
            data = reader.read(); // Read the next character
            reader.reset(); // Reset the stream to the marked position
            data = reader.read(); // Read the next character again
            System.out.println((char) data); // Output: H
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
