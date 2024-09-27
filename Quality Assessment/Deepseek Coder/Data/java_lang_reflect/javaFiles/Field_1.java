import java.lang.reflect.Field;
import java.util.ArrayList;

public class Field_1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elements = (Object[]) field.get(list);
        System.out.println(elements[0]);
    }
}
