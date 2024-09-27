import java.io.CharArrayWriter;

public class CharArrayWriter_2 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        writer.write(data, 0, data.length);
        System.out.println(writer.toString());
    }
}
