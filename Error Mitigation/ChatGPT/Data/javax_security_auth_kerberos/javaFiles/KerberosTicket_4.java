import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_4 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        boolean isRenewable = ticket.isRenewable();
        System.out.println("Is ticket renewable? " + isRenewable);
    }
}
