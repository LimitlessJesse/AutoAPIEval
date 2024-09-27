import java.lang.reflect.Field;

public class Field_1 {
    public static void main(String[] args) {
        try {
            Field field = MyClass.class.getDeclaredField("myField");
            Class<?> declaringClass = field.getDeclaringClass();
            System.out.println("Declaring class: " + declaringClass.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    public int myField;
}
