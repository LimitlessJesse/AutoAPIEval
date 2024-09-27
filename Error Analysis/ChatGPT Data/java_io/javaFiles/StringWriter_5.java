import java.io.StringWriter;

public class StringWriter_5 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write("Hello, World!");
        String result = writer.toString();
        System.out.println(result);
    }
}
