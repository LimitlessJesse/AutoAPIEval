import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.UserPrincipal;

public class AclEntry_Builder_1 {
    public static void main(String[] args) {
        AclEntry.Builder builder = AclEntry.newBuilder();
        UserPrincipal principal = ...; // Initialize UserPrincipal object
        builder.setPrincipal(principal);
    }
}
