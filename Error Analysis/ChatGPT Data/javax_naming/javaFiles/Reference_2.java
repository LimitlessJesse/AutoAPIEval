import javax.naming.Reference;

public class Reference_2 {
    public static void main(String[] args) {
        Reference reference = new Reference("TestClassName", "TestFactoryClassName", null);
        String factoryClassName = reference.getFactoryClassName();
        System.out.println("Factory Class Name: " + factoryClassName);
    }
}
