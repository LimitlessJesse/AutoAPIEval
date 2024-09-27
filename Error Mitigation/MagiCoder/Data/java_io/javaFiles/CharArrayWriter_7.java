import java.io.CharArrayWriter;

public class CharArrayWriter_7 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write("Hello, World!");
            System.out.println(writer.toString());
            writer.reset();
            System.out.println(writer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
