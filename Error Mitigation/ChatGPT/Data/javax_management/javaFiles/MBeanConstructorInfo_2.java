import javax.management.MBeanConstructorInfo;
import javax.management.MBeanParameterInfo;

public class MBeanConstructorInfo_2 {
    public static void main(String[] args) {
        MBeanConstructorInfo constructorInfo = new MBeanConstructorInfo("ConstructorName", "ConstructorDescription", new MBeanParameterInfo[0]);
        MBeanParameterInfo[] signature = constructorInfo.getSignature();
        
        for (MBeanParameterInfo parameterInfo : signature) {
            System.out.println("Parameter Name: " + parameterInfo.getName());
            System.out.println("Parameter Type: " + parameterInfo.getType());
            System.out.println("Parameter Description: " + parameterInfo.getDescription());
        }
    }
}
