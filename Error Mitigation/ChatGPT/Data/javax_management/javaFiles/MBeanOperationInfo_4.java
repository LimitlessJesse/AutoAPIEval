import javax.management.MBeanOperationInfo;

public class MBeanOperationInfo_4 {
    public static void main(String[] args) {
        MBeanOperationInfo operationInfo = new MBeanOperationInfo("operationName", "operationDescription", null, "String");
        String returnType = operationInfo.getReturnType();
        System.out.println("Return type: " + returnType);
    }
}
