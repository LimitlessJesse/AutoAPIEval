import javax.naming.ldap.LdapName;

public class LdapName_5 {
    public static void main(String[] args) {
        try {
            LdapName name1 = new LdapName("CN=John Doe,OU=People,DC=example,DC=com");
            LdapName name2 = new LdapName("OU=People,DC=example,DC=com");

            // Comparing two LdapName objects
            int result = name1.compareTo(name2);
            if (result < 0) {
                System.out.println(name1 + " comes before " + name2);
            } else if (result > 0) {
                System.out.println(name1 + " comes after " + name2);
            } else {
                System.out.println(name1 + " is equal to " + name2);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
