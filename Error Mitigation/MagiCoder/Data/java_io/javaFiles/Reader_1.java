import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Reader_1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Reader reader = new StringReader(str);
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
