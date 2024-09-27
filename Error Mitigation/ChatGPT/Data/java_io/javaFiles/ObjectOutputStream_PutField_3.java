import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_3 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
                @Override
                public void put(String name, char val) {
                    System.out.println("Putting value " + val + " into field " + name);
                }
            };
            
            putField.put("fieldName", 'A');
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
