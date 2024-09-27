import javax.management.MBeanOperationInfo;

public class MBeanOperationInfo_2 {
    public static void main(String[] args) {
        MBeanOperationInfo info = new MBeanOperationInfo("operationName", "operationDescription", MBeanOperationInfo.ACTION);
        int impact = info.getImpact();
        System.out.println("Operation Impact: " + impact);
    }
}
