import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_3 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate();
        String specificationName = delegate.getSpecificationName();
        System.out.println("Specification Name: " + specificationName);
    }
}
