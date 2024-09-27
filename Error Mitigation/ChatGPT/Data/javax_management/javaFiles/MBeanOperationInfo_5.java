import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;

public class MBeanOperationInfo_5 {
    public static void main(String[] args) {
        MBeanOperationInfo operationInfo = new MBeanOperationInfo("operationName", "operationDescription", new MBeanParameterInfo[0], "java.lang.String", MBeanOperationInfo.ACTION);
        
        MBeanParameterInfo[] parameters = operationInfo.getSignature();
        
        for (MBeanParameterInfo parameter : parameters) {
            System.out.println("Parameter Name: " + parameter.getName());
            System.out.println("Parameter Type: " + parameter.getType());
            System.out.println("Parameter Description: " + parameter.getDescription());
        }
    }
}
