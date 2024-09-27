import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStream_GetField_5 {
    public static void main(String[] args) {
        ObjectInputStream.GetField field = null; // Assume you have an ObjectInputStream.GetField object
        try {
            double value = field.get("fieldName", 0.0); // Get the value of the named double field with default value 0.0
            System.out.println("Value: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
