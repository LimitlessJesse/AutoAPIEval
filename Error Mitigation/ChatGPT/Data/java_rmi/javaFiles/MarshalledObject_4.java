import java.rmi.MarshalledObject;

public class MarshalledObject_4 {
    public static void main(String[] args) {
        MarshalledObject<String> marshalledObject = new MarshalledObject<>("Hello");
        int hashCode = marshalledObject.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
