import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_4 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
                @Override
                public void put(String name, double val) {
                    System.out.println("Putting value " + val + " into field " + name);
                }
            };
            
            putField.put("fieldName", 10.5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
