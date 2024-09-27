import java.security.ProtectionDomain;

public class ProtectionDomain_2 {
    public static void main(String[] args) {
        ProtectionDomain protectionDomain = Main.class.getProtectionDomain();
        ClassLoader classLoader = protectionDomain.getClassLoader();
        System.out.println(classLoader);
    }
}
