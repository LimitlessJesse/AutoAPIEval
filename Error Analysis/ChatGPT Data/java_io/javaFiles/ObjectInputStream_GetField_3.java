import java.io.ObjectInputStream;

public class ObjectInputStream_GetField_3 {
    public static void main(String[] args) {
        ObjectInputStream.GetField field = null; // Assume this is initialized with some values
        String name = "example";

        char defaultValue = 'a';
        char value = field.get(name, defaultValue);

        System.out.println("Value for " + name + " is: " + value);
    }
}
