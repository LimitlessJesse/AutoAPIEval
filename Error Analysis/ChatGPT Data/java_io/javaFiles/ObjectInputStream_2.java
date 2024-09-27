import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ObjectInputStream_2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
            int dataAvailable = ois.available();
            System.out.println("Number of bytes available to read: " + dataAvailable);
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
