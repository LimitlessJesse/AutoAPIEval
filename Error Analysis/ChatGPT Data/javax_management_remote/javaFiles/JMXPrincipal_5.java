import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_5 {
    
    public static void main(String[] args) {
        JMXPrincipal jmxPrincipal = new JMXPrincipal("myPrincipalName");
        int hashCode = jmxPrincipal.hashCode();
        System.out.println("Hash code of JMXPrincipal: " + hashCode);
    }
}
