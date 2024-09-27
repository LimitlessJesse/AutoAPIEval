import java.io.*;

public class ObjectInputStream_2 {
    public static void main(String[] args) {
        try {
            // Create a new ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));

            // Write an object to the file
            oos.writeObject("Hello, World!");

            // Close the ObjectOutputStream
            oos.close();

            // Create a new ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));

            // Read an object from the file
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
