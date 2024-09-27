import java.security.CodeSource;
import java.security.ProtectionDomain;

public class ProtectionDomain_1 {
    public static void main(String[] args) {
        ProtectionDomain domain = ProtectionDomain_1.class.getProtectionDomain();
        CodeSource codeSource = domain.getCodeSource();
        System.out.println("CodeSource: " + codeSource);
    }
}
