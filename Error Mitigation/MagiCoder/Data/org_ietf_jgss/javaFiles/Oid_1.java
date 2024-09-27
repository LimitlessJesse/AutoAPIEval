import org.ietf.jgss.Oid;

public class Oid_1 {
    public static void main(String[] args) {
        Oid oid1 = new Oid("1.2.3.4");
        Oid oid2 = new Oid("1.2.3.4");
        Oid oid3 = new Oid("5.6.7.8");

        System.out.println(oid1.equals(oid2));  // Outputs: true
        System.out.println(oid1.equals(oid3));  // Outputs: false
    }
}
