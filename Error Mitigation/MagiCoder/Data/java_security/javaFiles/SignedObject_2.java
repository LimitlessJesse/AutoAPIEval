import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.SignedObject;

public class SignedObject_2 {
    public static void main(String[] args) {
        try {
            // Create a SignedObject
            SignedObject signedObject = new SignedObject(new Object(), "myKey");

            // Get the object from the SignedObject
            Object object = signedObject.getObject();

            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
