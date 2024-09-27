import java.io.*;

public class ObjectInputStream_3 {
    public static void main(String[] args) {
        try {
            // Create a new ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));

            // Read an unshared object from the ObjectInputStream
            Object obj = ois.readUnshared();

            // Print the deserialized object
            System.out.println(obj);

            // Close the ObjectInputStream
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
