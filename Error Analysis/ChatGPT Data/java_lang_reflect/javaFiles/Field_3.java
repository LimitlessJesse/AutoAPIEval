import java.lang.reflect.Field;

public class Field_3 {
    public static void main(String[] args) {
        try {
            Field field = Main.class.getDeclaredField("fieldName");
            int modifiers = field.getModifiers();
            System.out.println("Modifiers: " + modifiers);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static int fieldName;
}
