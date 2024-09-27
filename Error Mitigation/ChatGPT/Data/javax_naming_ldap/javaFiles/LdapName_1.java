import javax.naming.ldap.LdapName;

public class LdapName_1 {
    public static void main(String[] args) {
        LdapName name1 = new LdapName("cn=John Doe,ou=People,dc=example,dc=com");
        LdapName name2 = new LdapName("cn=Jane Smith,ou=People,dc=example,dc=com");

        int result = name1.compareTo(name2);
        System.out.println("Comparison result: " + result);
    }
}
