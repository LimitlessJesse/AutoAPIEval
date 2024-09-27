import java.lang.reflect.Field;

public class Field_1 {
    public static void main(String[] args) {
        try {
            // Create an object of a sample class
            SampleClass obj = new SampleClass();

            // Get the field named "field" from the SampleClass
            Field field = obj.getClass().getDeclaredField("field");

            // Set the field accessible, as it's a private field
            field.setAccessible(true);

            // Get the value of the field from the object
            Object value = field.get(obj);

            // Output the value
            System.out.println("Field value: " + value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static class SampleClass {
        private String field = "Sample Field";
    }
}
