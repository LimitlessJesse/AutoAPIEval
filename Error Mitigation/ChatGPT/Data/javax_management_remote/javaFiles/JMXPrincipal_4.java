import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_4 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("admin");
        System.out.println(principal.toString());
    }
}
