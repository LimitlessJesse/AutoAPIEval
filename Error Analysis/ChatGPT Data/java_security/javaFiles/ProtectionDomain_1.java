import java.security.CodeSource;
import java.security.ProtectionDomain;

public class ProtectionDomain_1 {
    public static void main(String[] args) {
        ProtectionDomain pd = Main.class.getProtectionDomain();
        CodeSource cs = pd.getCodeSource();
        System.out.println("Code Source Location: " + cs.getLocation());
    }
}
