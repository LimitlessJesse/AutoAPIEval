import java.lang.reflect.Field;

public class Field_5 {
    public static void main(String[] args) {
        try {
            // Get the field "value" from the String class
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true); // Allow access to private field

            // Create a new String object
            String str = "Hello";

            // Get the value of the field "value" from the String object
            char[] value = (char[]) field.get(str);

            // Print the value
            System.out.println(value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
