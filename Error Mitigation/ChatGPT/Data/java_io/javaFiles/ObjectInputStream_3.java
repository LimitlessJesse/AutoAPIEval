import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ObjectInputStream_3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
            double value = ois.readDouble();
            System.out.println("Read double value: " + value);
            ois.close();
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            e.printStackTrace();
        }
    }
}
