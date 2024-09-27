import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(System.in);
            // Perform operations with the ObjectInputStream

            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
