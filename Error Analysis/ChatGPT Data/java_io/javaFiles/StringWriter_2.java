import java.io.StringWriter;

public class StringWriter_2 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write('A');
        System.out.println(writer.toString());
    }
}
