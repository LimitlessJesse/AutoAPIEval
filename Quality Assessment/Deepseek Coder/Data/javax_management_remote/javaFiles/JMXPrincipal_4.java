import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_4 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("username");
        int hashCode = principal.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
