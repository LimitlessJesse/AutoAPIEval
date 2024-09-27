import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_3 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("username");
        String str = principal.toString();
        System.out.println(str);
    }
}
