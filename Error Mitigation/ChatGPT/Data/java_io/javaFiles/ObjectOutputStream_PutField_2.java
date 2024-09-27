import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_2 {
    public static void main(String[] args) {
        ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
            @Override
            public void put(String name, byte val) {
                // Implementation of put method
            }
        };
        
        putField.put("fieldName", (byte) 10);
    }
}
