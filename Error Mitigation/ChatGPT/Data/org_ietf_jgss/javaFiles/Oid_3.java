import org.ietf.jgss.Oid;

public class Oid_3 {
    public static void main(String[] args) {
        Oid oid = new Oid(new int[]{1, 2, 3, 4, 5});
        System.out.println(oid.toString());
    }
}
