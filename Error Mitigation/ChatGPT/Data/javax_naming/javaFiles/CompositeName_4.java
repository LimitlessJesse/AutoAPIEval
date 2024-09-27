import javax.naming.CompositeName;
import javax.naming.Name;

public class CompositeName_4 {
    public static void main(String[] args) {
        CompositeName compositeName = new CompositeName("example/name");
        Name suffix = compositeName.getSuffix(1);
        System.out.println(suffix);
    }
}
