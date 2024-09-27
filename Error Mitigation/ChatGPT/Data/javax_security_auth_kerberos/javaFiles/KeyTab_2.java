import javax.security.auth.kerberos.KeyTab;

public class KeyTab_2 {
    public static void main(String[] args) {
        KeyTab keyTab = KeyTab.getInstance();
        boolean keyTabExists = keyTab.exists();
        System.out.println("Keytab file exists: " + keyTabExists);
    }
}
