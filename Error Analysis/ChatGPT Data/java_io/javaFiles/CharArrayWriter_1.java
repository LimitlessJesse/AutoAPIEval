import java.io.CharArrayWriter;

public class CharArrayWriter_1 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        writer.write(chars, 0, 5); // Write all characters in the char array
        System.out.println(writer.toString());
    }
}
