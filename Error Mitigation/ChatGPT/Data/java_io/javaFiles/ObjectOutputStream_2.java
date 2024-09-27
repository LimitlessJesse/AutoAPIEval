import java.io.*;

public class ObjectOutputStream_2 {
    public static void main(String[] args) {
        try {
            // Create an output stream
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write an integer value to the output stream
            objectOut.writeInt(42);

            // Close the output stream
            objectOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
