import org.ietf.jgss.Oid;

public class Oid_1 {
    public static void main(String[] args) {
        Oid oid1 = new Oid("1.2.3.4");
        Oid oid2 = new Oid("1.2.3.4");

        boolean result = oid1.equals(oid2);
        System.out.println("Are the Oid objects equal? " + result);
    }
}
