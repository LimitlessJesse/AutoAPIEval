import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream.PutField putField = new ObjectOutputStream().putFields();
            putField.put("name", true);
            // Use putField.put(String name, boolean val) method to set a boolean value
            // You can then serialize the object using ObjectOutputStream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
