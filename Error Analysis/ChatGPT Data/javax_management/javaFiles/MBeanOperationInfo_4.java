import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;

public class MBeanOperationInfo_4 {
    public static void main(String[] args) {
        MBeanOperationInfo operationInfo = new MBeanOperationInfo("operationName", "operationDescription", new MBeanParameterInfo[0], "java.lang.String", MBeanOperationInfo.ACTION);
        
        MBeanParameterInfo[] signature = operationInfo.getSignature();
        
        for (MBeanParameterInfo paramInfo : signature) {
            System.out.println("Parameter Name: " + paramInfo.getName());
            System.out.println("Parameter Type: " + paramInfo.getType());
        }
    }
}
