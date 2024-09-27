import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_5 {
    public static void main(String[] args) {
        JMXPrincipal principal1 = new JMXPrincipal("user1");
        JMXPrincipal principal2 = new JMXPrincipal("user2");
        JMXPrincipal principal3 = new JMXPrincipal("user1");

        System.out.println(principal1.equals(principal2)); // false
        System.out.println(principal1.equals(principal3)); // true
    }
}
