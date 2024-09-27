import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Reader_1 {
    public static void main(String[] args) {
        try {
            Reader reader = new StringReader("Hello, World!");
            int data;
            while ((data = reader.read())!= -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
