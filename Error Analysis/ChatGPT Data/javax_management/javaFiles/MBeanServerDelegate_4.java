import javax.management.MBeanServerDelegate;

public class MBeanServerDelegate_4 {
    public static void main(String[] args) {
        MBeanServerDelegate delegate = new MBeanServerDelegate() {
            @Override
            public String getSpecificationName() {
                return "MBeanServerDelegate Specification";
            }
        };

        System.out.println(delegate.getSpecificationName());
    }
}
