import java.lang.reflect.Field;

public class Class_5 {
    public static void main(String[] args) {
        Class<?> myClass = String.class;
        Field[] fields = myClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
