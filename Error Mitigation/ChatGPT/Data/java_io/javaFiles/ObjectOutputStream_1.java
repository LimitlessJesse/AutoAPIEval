import java.io.*;

public class ObjectOutputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a new file to write objects to
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Write an object to the ObjectOutputStream
            out.writeObject("Hello, World!");

            // Close the streams
            out.close();
            fileOut.close();

            // Read the object back from the file
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Read the object from the ObjectInputStream
            String str = (String) in.readObject();
            System.out.println(str);

            // Close the streams
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
