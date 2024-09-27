import java.lang.reflect.Field;

public class Field_2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        try {
            Field field = MyClass.class.getDeclaredField("myField");
            field.set(obj, "New value");
            System.out.println("Field value after set: " + obj.myField);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    public String myField = "Initial value";
}
