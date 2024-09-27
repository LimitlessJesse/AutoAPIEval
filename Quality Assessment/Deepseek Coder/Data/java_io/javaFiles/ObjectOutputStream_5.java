import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a new ObjectOutputStream
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.dat"));

            // Write an object to the output stream
            out.writeObject("Hello, World!");

            // Flush the output stream
            out.flush();

            System.out.println("Object has been written to the output stream.");

            // Close the output stream
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
