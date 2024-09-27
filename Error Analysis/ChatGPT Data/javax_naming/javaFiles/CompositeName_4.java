import javax.naming.CompositeName;
import javax.naming.Name;

public class CompositeName_4 {
    public static void main(String[] args) throws Exception {
        CompositeName compositeName = new CompositeName("java:comp/env/jdbc");
        Name prefix = compositeName.getPrefix(2);
        System.out.println("Prefix: " + prefix.toString());
    }
}
