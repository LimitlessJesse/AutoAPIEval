import java.io.IOException;
import java.io.Serializable;
import java.security.SignedObject;

public class SignedObject_1 {
    public static void main(String[] args) {
        try {
            // Create a SignedObject
            Serializable object = "Hello World";
            SignedObject signedObject = new SignedObject(object, null, null);

            // Retrieve the encapsulated object
            Object retrievedObject = signedObject.getObject();
            System.out.println(retrievedObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
