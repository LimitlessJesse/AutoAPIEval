import java.io.StringWriter;

public class StringWriter_2 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        int off = 0;
        int len = 5;
        
        writer.write(cbuf, off, len);
        
        System.out.println(writer.toString());
    }
}
