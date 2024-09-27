import javax.naming.Reference;

public class Reference_4 {
    public static void main(String[] args) {
        Reference reference = new Reference("java.lang.String");
        String className = reference.getClassName();
        System.out.println("Class name: " + className);
    }
}
