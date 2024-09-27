import org.ietf.jgss.Oid;

public class Oid_4 {
    public static void main(String[] args) {
        Oid oid = new Oid(new int[]{1, 3, 6, 1, 5, 5, 2});
        String oidString = oid.toString();
        System.out.println("OID: " + oidString);
    }
}
