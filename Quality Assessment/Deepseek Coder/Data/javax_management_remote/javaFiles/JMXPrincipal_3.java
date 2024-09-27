import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_3 {
    public static void main(String[] args) {
        JMXPrincipal principal1 = new JMXPrincipal("username");
        JMXPrincipal principal2 = new JMXPrincipal("username");

        boolean isEqual = principal1.equals(principal2);

        System.out.println("Are the two principals equal? " + isEqual);
    }
}
