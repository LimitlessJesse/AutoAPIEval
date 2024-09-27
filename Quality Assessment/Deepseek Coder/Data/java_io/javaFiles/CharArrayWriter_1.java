import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_1 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();

        try {
            writer.write('A');  // Writing the character 'A'
            writer.write('B');  // Writing the character 'B'
            writer.write('C');  // Writing the character 'C'

            char[] charArray = writer.toCharArray();  // Converting the CharArrayWriter to a char array

            // Printing the char array
            for (char c : charArray) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
