import java.io.IOException;
import java.io.StringReader;

public class StringReader_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringReader reader = new StringReader(str);
        int c;
        try {
            while ((c = reader.read())!= -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
