import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_4 {
    public static void main(String[] args) {
        ObjectOutputStream.PutField putField = new ObjectOutputStream.PutFieldImpl();
        putField.put("fieldName", 10.5);
    }
}
