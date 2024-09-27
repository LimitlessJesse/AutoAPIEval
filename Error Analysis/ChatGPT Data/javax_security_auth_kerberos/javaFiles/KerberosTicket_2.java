import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_2 {
    public static void main(String[] args) {
        // Assume you have a KerberosTicket object called kerberosTicket
        KerberosPrincipal client = kerberosTicket.getClient();
        System.out.println("Client Principal: " + client);
    }
}
