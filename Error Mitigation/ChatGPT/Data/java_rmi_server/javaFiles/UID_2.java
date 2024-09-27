import java.rmi.server.UID;

public class UID_2 {
    public static void main(String[] args) {
        UID uid1 = new UID();
        UID uid2 = new UID();

        System.out.println("UID 1: " + uid1);
        System.out.println("UID 2: " + uid2);

        boolean isEqual = uid1.equals(uid2);
        System.out.println("Are the UIDs equal? " + isEqual);
    }
}
