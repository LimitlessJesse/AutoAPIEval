import java.io.*;

public class ObjectOutputStream_17 {
    public static void main(String[] args) {
        try {
            // Create a new ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));

            // Write an object to the stream
            oos.writeObject("Hello");

            // Reset the stream
            oos.reset();

            // Write another object to the stream
            oos.writeObject("World");

            // Close the stream
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
