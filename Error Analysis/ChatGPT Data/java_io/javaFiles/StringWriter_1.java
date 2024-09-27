import java.io.StringWriter;

public class StringWriter_1 {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        sw.write("Hello, this is a test string");
        System.out.println(sw.toString());
    }
}
