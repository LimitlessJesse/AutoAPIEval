import java.lang.reflect.Field;

public class Field_2 {
    public static void main(String[] args) throws Exception {
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);

        String str = new String("Hello");
        field.set(str, "World".toCharArray());

        System.out.println(str);
    }
}
