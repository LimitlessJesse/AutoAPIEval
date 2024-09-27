import java.security.ProtectionDomain;
import java.security.Principal;

public class ProtectionDomain_4 {
    public static void main(String[] args) {
        ProtectionDomain domain = new ProtectionDomain(null, null);
        Principal[] principals = domain.getPrincipals();
        for (Principal principal : principals) {
            System.out.println(principal.getName());
        }
    }
}
