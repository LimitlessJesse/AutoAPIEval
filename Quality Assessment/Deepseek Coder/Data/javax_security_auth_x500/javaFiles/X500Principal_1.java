import javax.security.auth.x500.X500Principal;

public class X500Principal_1 {
    public static void main(String[] args) {
        try {
            X500Principal principal = new X500Principal("cn=John Doe, ou=Users, o=Acme Inc");
            String name = principal.getName();
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
