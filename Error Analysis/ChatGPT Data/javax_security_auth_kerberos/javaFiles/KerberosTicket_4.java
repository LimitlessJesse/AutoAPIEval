import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_4 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        boolean forwardable = ticket.isForwardable();
        System.out.println("Is forwardable: " + forwardable);
    }
}
