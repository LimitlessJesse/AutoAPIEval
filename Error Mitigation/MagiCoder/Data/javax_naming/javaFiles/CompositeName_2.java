import javax.naming.CompositeName;
import javax.naming.NamingException;

public class CompositeName_2 {
    public static void main(String[] args) throws NamingException {
        CompositeName compositeName = new CompositeName(new String[]{"com", "example", "test"});
        System.out.println(compositeName.get(1)); // Output: example
    }
}
