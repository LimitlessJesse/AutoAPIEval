import java.lang.reflect.Field;

public class Field_4 {
    public static void main(String[] args) {
        try {
            Field field = Main.class.getDeclaredField("fieldName");
            Class<?> fieldType = field.getType();
            System.out.println("Field type: " + fieldType.getName());
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found");
        }
    }

    private String fieldName;
}
