import java.io.ObjectInputStream;
import java.io.IOException;

public class ObjectInputStream_GetField_2 {
    public static void main(String[] args) {
        ObjectInputStream.GetField getField = null; // Initialize ObjectInputStream.GetField
        
        try {
            boolean value = getField.get("fieldName", true); // Get the value of the named boolean field
            System.out.println("Value: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
