import javax.naming.ldap.Rdn;

public class Rdn_1 {
    public static void main(String[] args) {
        Rdn rdn = new Rdn("cn", "John Doe");
        String type = rdn.getType();
        System.out.println("Type: " + type);
    }
}
