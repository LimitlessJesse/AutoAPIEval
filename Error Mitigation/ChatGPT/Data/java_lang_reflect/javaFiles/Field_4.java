import java.lang.reflect.Field;

public class Field_4 {
    public static void main(String[] args) {
        Field[] fields = Field_4.class.getDeclaredFields();
        
        for(Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
        }
    }
}
