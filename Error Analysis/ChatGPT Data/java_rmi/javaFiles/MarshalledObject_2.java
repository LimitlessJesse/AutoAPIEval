import java.rmi.MarshalledObject;

public class MarshalledObject_2 {
    public static void main(String[] args) {
        try {
            MarshalledObject<String> obj1 = new MarshalledObject<>("Hello");
            MarshalledObject<String> obj2 = new MarshalledObject<>("Hello");
            
            boolean isEqual = obj1.equals(obj2);
            
            System.out.println("Are the objects equal? " + isEqual);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
