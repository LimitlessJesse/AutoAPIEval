import java.io.CharArrayWriter;

public class CharArrayWriter_1 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write('A');
        System.out.println(writer.toString());
    }
}
