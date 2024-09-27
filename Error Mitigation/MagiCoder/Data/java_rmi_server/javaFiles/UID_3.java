import java.rmi.server.UID;

public class UID_3 {
    public static void main(String[] args) {
        UID uid = new UID();
        int hashCode = uid.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
