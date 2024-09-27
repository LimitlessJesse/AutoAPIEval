import java.rmi.server.UID;

public class UID_2 {
    public static void main(String[] args) {
        UID uid1 = new UID();
        UID uid2 = new UID();

        System.out.println(uid1.equals(uid2));
    }
}
