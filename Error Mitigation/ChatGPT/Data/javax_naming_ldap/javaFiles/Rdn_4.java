import javax.naming.ldap.Rdn;

public class Rdn_4 {
    public static void main(String[] args) {
        try {
            Rdn rdn1 = new Rdn("cn=John");
            Rdn rdn2 = new Rdn("cn=Jane");
            
            int comparison = rdn1.compareTo(rdn2);
            System.out.println("Comparison result: " + comparison);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
