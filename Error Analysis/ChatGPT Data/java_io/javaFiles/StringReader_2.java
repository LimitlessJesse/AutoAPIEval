import java.io.StringReader;
import java.io.IOException;

public class StringReader_2 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Example String");
        char[] buffer = new char[5];
        try {
            int bytesRead = stringReader.read(buffer, 2, 3);
            System.out.println("Number of characters read: " + bytesRead);
            System.out.println("Characters read: ");
            for (char c : buffer) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
