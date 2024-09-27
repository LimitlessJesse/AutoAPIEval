import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_5 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("username");
        System.out.println(principal.toString());
    }
}
