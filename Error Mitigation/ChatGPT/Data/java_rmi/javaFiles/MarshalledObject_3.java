import java.rmi.MarshalledObject;

public class MarshalledObject_3 {
    public static void main(String[] args) {
        try {
            // Create two MarshalledObject instances with the same serialized object
            MarshalledObject<String> obj1 = new MarshalledObject<>("Hello");
            MarshalledObject<String> obj2 = new MarshalledObject<>("Hello");

            // Compare the two MarshalledObject instances
            boolean result = obj1.equals(obj2);

            // Print the result
            System.out.println("Are the two MarshalledObjects equal? " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
