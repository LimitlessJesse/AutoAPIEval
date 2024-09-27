import java.lang.reflect.Field;

public class Field_3 {
    public static void main(String[] args) {
        Field field = Field_3.class.getDeclaredField("fieldName");
        System.out.println("Field Name: " + field.getName());
    }
}
