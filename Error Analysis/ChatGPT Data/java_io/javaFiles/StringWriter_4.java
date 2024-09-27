import java.io.StringWriter;

public class StringWriter_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        String str = "Hello World";
        int off = 6;
        int len = 5;
        
        writer.write(str, off, len);
        
        System.out.println(writer.toString()); // Output: World
    }
}
