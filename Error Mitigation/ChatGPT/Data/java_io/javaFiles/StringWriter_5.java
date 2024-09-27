import java.io.StringWriter;

public class StringWriter_5 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write("Hello");
        System.out.println(writer.toString());
    }
}
