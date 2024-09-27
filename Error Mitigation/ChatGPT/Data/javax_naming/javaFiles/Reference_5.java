import javax.naming.Reference;

public class Reference_5 {
    public static void main(String[] args) {
        Reference reference = new Reference("java.lang.String");
        String factoryClassName = reference.getFactoryClassName();
        System.out.println("Factory class name: " + factoryClassName);
    }
}
