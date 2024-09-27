import javax.naming.CompositeName;
import javax.naming.Name;

public class CompositeName_3 {
    public static void main(String[] args) {
        CompositeName compositeName = new CompositeName("example/name/test");
        Name prefix = compositeName.getPrefix(2);
        System.out.println(prefix);
    }
}
