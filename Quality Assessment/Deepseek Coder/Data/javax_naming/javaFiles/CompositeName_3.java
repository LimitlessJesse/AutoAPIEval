import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NamingException;

public class CompositeName_3 {
    public static void main(String[] args) {
        try {
            CompositeName compositeName = new CompositeName();
            Name name = compositeName.add("name");
            System.out.println(name);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
