import java.rmi.MarshalledObject;

public class MarshalledObject_5 {
    public static void main(String[] args) {
        try {
            MarshalledObject obj = new MarshalledObject(new Object(), null);
            int hashCode = obj.hashCode();
            System.out.println("Hash code: " + hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
