import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class BufferedReader_3 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        char[] buffer = new char[5];
        
        try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
            int numCharsRead = reader.read(buffer, 0, 5);
            
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: ");
            for (char c : buffer) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
