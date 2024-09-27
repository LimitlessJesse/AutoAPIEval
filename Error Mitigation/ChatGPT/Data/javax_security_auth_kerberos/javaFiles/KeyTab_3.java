import javax.security.auth.kerberos.KeyTab;
import java.io.File;

public class KeyTab_3 {
    public static void main(String[] args) {
        File keytabFile = new File("example.keytab");
        KeyTab keyTab = KeyTab.getInstance(keytabFile);
        System.out.println("KeyTab instance created successfully");
    }
}
