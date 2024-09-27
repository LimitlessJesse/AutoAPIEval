import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_5 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        boolean renewable = ticket.isRenewable();
        System.out.println("Is ticket renewable? " + renewable);
    }
}
