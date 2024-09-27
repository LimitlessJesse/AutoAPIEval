import javax.naming.RefAddr;
import javax.naming.Reference;
import java.util.Enumeration;

public class Reference_3 {
    public static void main(String[] args) {
        Reference reference = new Reference("Test");
        Enumeration<RefAddr> addresses = reference.getAll();
        while (addresses.hasMoreElements()) {
            RefAddr address = addresses.nextElement();
            System.out.println(address);
        }
    }
}
