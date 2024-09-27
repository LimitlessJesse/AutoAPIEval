import java.lang.reflect.Field;
import java.util.ArrayList;

public class Field_3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("Type of elementData: " + field.getType());
        System.out.println("Actual elementData: " + java.util.Arrays.toString(elementData));
    }
}
