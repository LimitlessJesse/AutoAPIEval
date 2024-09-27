import javax.naming.CompositeName;

public class CompositeName_3 {
    public static void main(String[] args) {
        CompositeName compositeName = new CompositeName("example/name");
        System.out.println(compositeName.endsWith(new CompositeName("name"))); // Output: true
    }
}
