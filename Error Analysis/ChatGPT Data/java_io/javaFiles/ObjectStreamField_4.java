import java.io.ObjectStreamField;

public class ObjectStreamField_4 {
    public static void main(String[] args) {
        // Create an ObjectStreamField
        ObjectStreamField field = new ObjectStreamField("name", String.class);

        // Get the type of the field as a string
        String typeString = field.getTypeString();

        // Print the type string
        System.out.println("Type of the field: " + typeString);
    }
}
