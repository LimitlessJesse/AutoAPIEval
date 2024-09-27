import java.io.StringWriter;

public class StringWriter_6 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        writer.write(cbuf, 0, 5);
        System.out.println(writer.toString());
    }
}
