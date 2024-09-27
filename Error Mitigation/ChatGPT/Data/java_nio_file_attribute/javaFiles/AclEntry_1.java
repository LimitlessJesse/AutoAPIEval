import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.UserPrincipal;

public class AclEntry_1 {
    public static void main(String[] args) {
        AclEntry aclEntry = ...; // Initialize AclEntry object
        UserPrincipal principal = aclEntry.principal();
        System.out.println("Principal: " + principal);
    }
}
