import java.security.ProtectionDomain;
import java.security.Principal;

public class ProtectionDomain_4 {
    public static void main(String[] args) {
        ProtectionDomain pd = Main.class.getProtectionDomain();
        Principal[] principals = pd.getPrincipals();
        
        if(principals != null){
            for(Principal principal : principals){
                System.out.println("Principal name: " + principal.getName());
            }
        } else {
            System.out.println("No principals found.");
        }
    }
}
