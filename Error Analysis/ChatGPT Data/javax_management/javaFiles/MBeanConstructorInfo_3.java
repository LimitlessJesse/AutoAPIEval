import javax.management.MBeanParameterInfo;

public class MBeanConstructorInfo_3 {
    public static void main(String[] args) {
        // Assuming constructorInfo is an instance of MBeanConstructorInfo
        MBeanParameterInfo[] signature = constructorInfo.getSignature();
        
        // Print information about each parameter
        for(MBeanParameterInfo param : signature) {
            System.out.println("Name: " + param.getName());
            System.out.println("Description: " + param.getDescription());
            System.out.println("Type: " + param.getType());
        }
    }
}
