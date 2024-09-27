import java.security.ProtectionDomain;

public class ProtectionDomain_3 {
    public static void main(String[] args) {
        ProtectionDomain domain = ProtectionDomain_3.class.getProtectionDomain();
        ClassLoader classLoader = domain.getClassLoader();
        System.out.println("ClassLoader of this domain: " + classLoader);
    }
}
