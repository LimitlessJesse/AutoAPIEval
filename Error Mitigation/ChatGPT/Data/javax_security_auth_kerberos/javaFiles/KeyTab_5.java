import javax.security.auth.kerberos.KeyTab;

public class KeyTab_5 {
    public static void main(String[] args) {
        KeyTab keyTab = KeyTab.getInstance();
        boolean bound = keyTab.isBound();
        System.out.println("Is keytab bound to a principal? " + bound);
    }
}
