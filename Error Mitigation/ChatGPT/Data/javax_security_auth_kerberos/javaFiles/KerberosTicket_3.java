import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_3 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        boolean isForwardable = ticket.isForwardable();
        System.out.println("Is ticket forwardable? " + isForwardable);
    }
}
