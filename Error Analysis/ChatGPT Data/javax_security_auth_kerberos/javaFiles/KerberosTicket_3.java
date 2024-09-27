import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_3 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket(new byte[]{}, new KerberosPrincipal("server"));
        KerberosPrincipal serverPrincipal = ticket.getServer();
        System.out.println("Server Principal: " + serverPrincipal);
    }
}
