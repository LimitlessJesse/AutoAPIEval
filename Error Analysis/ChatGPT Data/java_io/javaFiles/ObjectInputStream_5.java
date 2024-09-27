import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("data.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            char charValue = objectIn.readChar();
            System.out.println("Read char value: " + charValue);

            objectIn.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
