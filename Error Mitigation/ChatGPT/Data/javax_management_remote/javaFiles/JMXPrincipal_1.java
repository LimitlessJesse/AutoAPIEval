import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_1 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("admin");
        String name = principal.getName();
        System.out.println("Principal name: " + name);
    }
}
