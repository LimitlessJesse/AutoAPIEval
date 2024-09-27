import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ObjectInputStream_2 {
    public static void main(String[] args) {
        try {
            // Create an ObjectInputStream to read the object from the file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));

            // Read the object from the file
            Object obj = ois.readObject();

            // Print the object
            System.out.println(obj);

            // Close the ObjectInputStream
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
