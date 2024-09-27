import org.ietf.jgss.Oid;

public class Oid_2 {
    public static void main(String[] args) {
        Oid oid = new Oid("1.2.3.4");
        int hashCode = oid.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
