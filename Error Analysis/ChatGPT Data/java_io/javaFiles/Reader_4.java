import java.io.StringReader;

public class Reader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        if(reader.ready()) {
            System.out.println("Stream is ready to be read.");
        } else {
            System.out.println("Stream is not ready.");
        }
    }
}
