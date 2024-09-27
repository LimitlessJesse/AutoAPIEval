import org.ietf.jgss.Oid;
import java.util.Arrays;

public class Oid_1 {
    public static void main(String[] args) {
        Oid oid = new Oid("1.2.840.113554.1.2.2");
        byte[] der = oid.getDER();
        System.out.println(Arrays.toString(der));
    }
}
