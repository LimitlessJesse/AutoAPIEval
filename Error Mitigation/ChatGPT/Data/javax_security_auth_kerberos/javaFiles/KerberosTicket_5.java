import javax.security.auth.kerberos.KerberosTicket;

public class KerberosTicket_5 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        boolean postdated = ticket.isPostdated();
        System.out.println("Is ticket post-dated? " + postdated);
    }
}
