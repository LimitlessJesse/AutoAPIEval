import java.io.ObjectInputStream;

public class ObjectInputStream_GetField_2 {
    public static void main(String[] args) {

        // Create an instance of ObjectInputStream.GetField
        ObjectInputStream.GetField getField = null;

        // Use getField.get(String name, byte defaultValue) method
        byte result = getField.get("fieldName", (byte) 10);

        // Print the result
        System.out.println("Byte value: " + result);
    }
}
