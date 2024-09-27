import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_1 {
    public static void main(String[] args) {
        // Create a JMXPrincipal
        JMXPrincipal principal = new JMXPrincipal("username");

        // Get the name of the principal
        String name = principal.getName();

        // Print the name
        System.out.println("Name: " + name);
    }
}
