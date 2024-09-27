import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet6Address_2 {
    public static void main(String[] args) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByName("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
            int scopeId = inet6Address.getScopeId();
            System.out.println("ScopeId: " + scopeId);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
