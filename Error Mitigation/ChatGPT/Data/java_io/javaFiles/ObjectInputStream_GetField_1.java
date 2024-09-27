import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStream_GetField_1 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(System.in);
            ObjectInputStream.GetField getField = ois.readFields();
            boolean isDefaulted = getField.defaulted("fieldName");
            System.out.println("Is field defaulted: " + isDefaulted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
