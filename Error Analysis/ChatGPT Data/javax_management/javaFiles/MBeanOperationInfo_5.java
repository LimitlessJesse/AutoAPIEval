import javax.management.MBeanOperationInfo;

public class MBeanOperationInfo_5 {
    public static void main(String[] args) {
        MBeanOperationInfo info = new MBeanOperationInfo("operationName", "description", null, "String", MBeanOperationInfo.ACTION);
        String returnType = info.getReturnType();
        System.out.println("Return Type: " + returnType);
    }
}
