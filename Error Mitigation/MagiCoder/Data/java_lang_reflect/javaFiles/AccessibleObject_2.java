import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;

public class AccessibleObject_2 {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the class
        MyClass myObject = new MyClass();

        // Get the class of the object
        Class<?> myClass = myObject.getClass();

        // Get the field
        Field field = myClass.getDeclaredField("myField");

        // Set the field accessible
        field.setAccessible(true);

        // Get the value of the field
        Object value = field.get(myObject);

        System.out.println("Value of myField: " + value);
    }
}

class MyClass {
    private String myField = "Hello, world!";
}
