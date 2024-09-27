import java.security.ProtectionDomain;
import java.security.Principal;

public class ProtectionDomain_3 {
    public static void main(String[] args) {
        ProtectionDomain domain = ProtectionDomain.getProtectionDomain(ProtectionDomain_3.class);
        Principal[] principals = domain.getPrincipals();

        for (Principal principal : principals) {
            System.out.println(principal.getName());
        }
    }
}
