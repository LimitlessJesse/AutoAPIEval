import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NamingException;
import java.util.ArrayList;

public class CompositeName_4 {
    public static void main(String[] args) {
        try {
            CompositeName compositeName = new CompositeName("cn=John,dc=example,dc=com");
            Name name = new CompositeName("ou=Sales,dc=example,dc=com");

            ArrayList<Name> list = new ArrayList<>();
            list.add(compositeName);
            list.addAll(name);

            System.out.println(list);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
