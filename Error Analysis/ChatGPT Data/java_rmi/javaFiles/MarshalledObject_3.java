import java.rmi.MarshalledObject;

public class MarshalledObject_3 {
    public static void main(String[] args) {
        try {
            String str = "Hello World";
            MarshalledObject<String> mo = new MarshalledObject<>(str);
            int hash = mo.hashCode();
            System.out.println("HashCode: " + hash);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
