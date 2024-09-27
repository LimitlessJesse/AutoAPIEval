import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_2 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("username");
        String name = principal.getName();
        System.out.println("Name: " + name);
    }
}
