import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_3 {
    public static void main(String[] args) {
        KerberosPrincipal kp1 = new KerberosPrincipal("test/test@TEST.COM");
        KerberosPrincipal kp2 = new KerberosPrincipal("test/test@TEST.COM");

        boolean isEqual = kp1.equals(kp2);

        System.out.println("Are the two KerberosPrincipal objects equal? " + isEqual);
    }
}
