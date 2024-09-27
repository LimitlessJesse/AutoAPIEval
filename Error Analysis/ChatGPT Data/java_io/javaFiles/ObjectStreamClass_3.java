import java.io.ObjectStreamField;
import java.io.ObjectStreamClass;

public class ObjectStreamClass_3 {
    public static void main(String[] args) {
        // Creating an ObjectStreamClass for demonstration
        ObjectStreamField[] fields = {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("age", int.class)
        };
        ObjectStreamClass osc = ObjectStreamClass.lookup(MyClass.class);

        // Getting the field with name "age"
        ObjectStreamField field = osc.getField("age");

        // Outputting the field's details
        if(field != null) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().toString());
        } else {
            System.out.println("Field not found.");
        }
    }
}

class MyClass {
    private String name;
    private int age;
}
