import javax.naming.ldap.Rdn;

public class Rdn_5 {
    public static void main(String[] args) {
        Rdn rdn1 = new Rdn("cn", "John Doe");
        Rdn rdn2 = new Rdn("cn", "John Doe");

        boolean isEqual = rdn1.equals(rdn2);

        System.out.println("Are the Rdn objects equal? " + isEqual);
    }
}
