import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permission_2 {
    public static void main(String[] args) {
        Permission perm1 = new Permission("read");
        Permission perm2 = new Permission("write");

        PermissionCollection permCollection = new Permissions();
        permCollection.add(perm1);

        // Check if perm1 is equal to perm2
        boolean isEqual = perm1.equals(perm2);
        System.out.println("perm1 and perm2 are equal: " + isEqual);

        // Check if perm1 is in permCollection
        isEqual = permCollection.implies(perm1);
        System.out.println("perm1 is in permCollection: " + isEqual);
    }
}
