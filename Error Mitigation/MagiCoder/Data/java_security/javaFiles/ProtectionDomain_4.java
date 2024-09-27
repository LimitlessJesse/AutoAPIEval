import java.security.CodeSource;
import java.security.ProtectionDomain;

public class ProtectionDomain_4 {
    public static void main(String[] args) {
        ProtectionDomain protectionDomain = ProtectionDomain_4.class.getProtectionDomain();
        CodeSource codeSource = protectionDomain.getCodeSource();
        System.out.println(codeSource);
    }
}
