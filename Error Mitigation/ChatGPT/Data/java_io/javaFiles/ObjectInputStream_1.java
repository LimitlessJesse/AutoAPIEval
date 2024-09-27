import java.io.*;

public class ObjectInputStream_1 {
    public static void main(String[] args) {
        try {
            // Create an ObjectInputStream to read objects from a file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));

            // Read an object from the ObjectInputStream
            Object obj = ois.readObject();

            // Print the object read from the stream
            System.out.println("Object read from stream: " + obj);

            // Close the ObjectInputStream
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
