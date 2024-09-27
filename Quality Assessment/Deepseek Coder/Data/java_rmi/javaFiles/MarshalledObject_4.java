import java.io.IOException;
import java.io.NotSerializableException;
import java.rmi.MarshalledObject;
import java.rmi.server.UnmarshalledObject;

public class MarshalledObject_4 {
    public static void main(String[] args) throws IOException, NotSerializableException {
        // Create a new object
        Object obj = new Object();

        // Create a new MarshalledObject
        MarshalledObject marshalledObject = new MarshalledObject(obj);

        // Create another object
        Object obj2 = new Object();

        // Create another MarshalledObject
        MarshalledObject marshalledObject2 = new MarshalledObject(obj2);

        // Compare the two MarshalledObjects
        boolean isEqual = marshalledObject.equals(marshalledObject2);

        // Print the result
        System.out.println("Are the two MarshalledObjects equal? " + isEqual);
    }
}
