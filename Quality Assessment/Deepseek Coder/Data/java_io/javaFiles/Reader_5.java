import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reader_5 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("example.txt");
            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader!= null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
