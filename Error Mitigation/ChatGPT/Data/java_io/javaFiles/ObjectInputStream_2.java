import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ObjectInputStream_2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
            int num = ois.readInt();
            System.out.println("Read integer: " + num);
            ois.close();
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
