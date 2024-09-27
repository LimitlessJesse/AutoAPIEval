import java.io.ObjectInputStream;

public class ObjectInputStream_GetField_4 {
    public static void main(String[] args) {
        ObjectInputStream.GetField getField = null; // Assuming getField is obtained from somewhere
        
        // Using double get(String name, double defaultValue) method
        double value = getField.get("fieldName", 0.0);
        System.out.println("Value: " + value);
    }
}
