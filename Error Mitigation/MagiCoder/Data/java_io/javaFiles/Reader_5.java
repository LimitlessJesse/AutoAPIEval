import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader_5 {
    public static void main(String[] args) {
        try {
            Reader reader = new StringReader("Hello, World!");
            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                if (reader.ready()) {
                    System.out.println(": Stream is ready to read");
                } else {
                    System.out.println(": Stream is not ready to read");
                }
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
