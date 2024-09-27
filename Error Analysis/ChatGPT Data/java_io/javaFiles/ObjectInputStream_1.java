import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();
            System.out.println("Object read from file: " + obj);

            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
