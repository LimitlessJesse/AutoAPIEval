import org.ietf.jgss.Oid;

public class Oid_2 {
    public static void main(String[] args) {
        Oid oid = new Oid(new int[]{1, 3, 6, 1, 5, 5, 2});
        int hashCode = oid.hashCode();
        System.out.println("Hash code for Oid: " + hashCode);
    }
}
