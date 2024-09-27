import java.io.ObjectStreamField;

public class ObjectStreamField_3 {
    public static void main(String[] args) {
        ObjectStreamField[] fields = {
            new ObjectStreamField("name", String.class)
        };

        Class<?> type = fields[0].getType();
        System.out.println(type.getName());
    }
}
