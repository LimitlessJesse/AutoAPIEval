import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_4 {
    public static void main(String[] args) {
        JMXPrincipal principal1 = new JMXPrincipal("admin");
        JMXPrincipal principal2 = new JMXPrincipal("admin");

        System.out.println(principal1.equals(principal2)); // Output: true
    }
}
