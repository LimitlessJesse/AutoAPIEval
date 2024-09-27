import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ObjectInputStream_4 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("file.txt"));
            // read objects from file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois!= null) {
                    ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
