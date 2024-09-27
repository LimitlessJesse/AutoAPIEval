import org.ietf.jgss.Oid;

public class Oid_3 {
    public static void main(String[] args) {
        Oid oid1 = new Oid(new int[]{1, 3, 6, 1, 5, 5, 2});
        Oid oid2 = new Oid(new int[]{1, 3, 6, 1, 5, 5, 2});

        boolean isEqual = oid1.equals(oid2);
        System.out.println("Are the Oids equal? " + isEqual);
    }
}
