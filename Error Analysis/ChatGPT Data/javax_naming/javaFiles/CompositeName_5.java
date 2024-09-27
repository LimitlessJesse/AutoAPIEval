import javax.naming.CompositeName;

public class CompositeName_5 {
    public static void main(String[] args) {
        CompositeName compositeName = new CompositeName("java.example");
        boolean startsWith = compositeName.startsWith(new CompositeName("java"));
        System.out.println(startsWith); // Output: true
    }
}
