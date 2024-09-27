import java.security.*;

public class UnresolvedPermission_3 {
    public static void main(String[] args) {
        try {
            Permission permission1 = new UnresolvedPermission("read");
            Permission permission2 = new UnresolvedPermission("write");

            boolean implies = permission1.implies(permission2);

            System.out.println(implies);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
