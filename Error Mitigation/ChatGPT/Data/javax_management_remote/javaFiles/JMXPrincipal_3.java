import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_3 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("admin");
        int hashCode = principal.hashCode();
        System.out.println("Hash code for JMXPrincipal: " + hashCode);
    }
}
