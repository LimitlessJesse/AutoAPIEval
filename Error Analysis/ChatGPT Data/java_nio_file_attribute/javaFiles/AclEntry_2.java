import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.UserPrincipal;

public class AclEntry_2 {
    public static void main(String[] args) {
        AclEntry aclEntry = ...; // Initialize AclEntry object
        UserPrincipal userPrincipal = aclEntry.principal();
        System.out.println("User Principal: " + userPrincipal.getName());
    }
}
