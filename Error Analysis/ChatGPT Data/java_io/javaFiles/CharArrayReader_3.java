import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_3 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        CharArrayReader reader = new CharArrayReader(charArray);

        try {
            // Read and print character by character
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            // Close the CharArrayReader
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
