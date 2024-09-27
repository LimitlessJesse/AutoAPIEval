import org.ietf.jgss.Oid;

public class Oid_2 {
    public static void main(String[] args) {
        Oid oid = new Oid();
        int hashCode = oid.hashCode();
        System.out.println("Hashcode value for Oid: " + hashCode);
    }
}
