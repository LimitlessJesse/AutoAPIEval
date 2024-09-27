import java.io.StringWriter;

public class StringWriter_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        String str = "Hello, World!";
        writer.write(str, 0, 5); // Writing the first 5 characters of the string
        System.out.println(writer.toString()); // Output: Hello
    }
}
