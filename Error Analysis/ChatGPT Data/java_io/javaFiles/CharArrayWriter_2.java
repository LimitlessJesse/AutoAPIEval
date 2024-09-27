import java.io.CharArrayWriter;

public class CharArrayWriter_2 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();

        // Writing a single character 'A' using write(int c) method
        writer.write('A');

        // Getting the written characters as a char array
        char[] charArray = writer.toCharArray();

        // Printing the written characters
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
