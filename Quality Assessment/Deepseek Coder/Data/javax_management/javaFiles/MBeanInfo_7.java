import javax.management.MBeanInfo;
import javax.management.MBeanOperationInfo;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class MBeanInfo_7 {
    public static void main(String[] args) throws Exception {
        ObjectName name = new ObjectName("java.lang:type=Memory");
        MBeanInfo info = ManagementFactory.getThreadMXBean().getObjectName(name).getMBeanInfo();
        MBeanOperationInfo[] operations = info.getOperations();

        for (MBeanOperationInfo operation : operations) {
            System.out.println("Operation: " + operation.getName());
            System.out.println("Description: " + operation.getDescription());
            System.out.println("Return type: " + operation.getReturnType());
            System.out.println("Arguments: ");

            for (MBeanParameterInfo argument : operation.getArguments()) {
                System.out.println("  " + argument.getName() + ": " + argument.getType());
            }
        }
    }
}
