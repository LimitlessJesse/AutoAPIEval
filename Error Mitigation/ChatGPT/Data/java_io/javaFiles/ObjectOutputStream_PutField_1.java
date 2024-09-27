import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
                @Override
                public void put(String name, boolean val) {
                    System.out.println("Putting value for field: " + name + " with value: " + val);
                }
            };
            
            putField.put("isFlag", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
