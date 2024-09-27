import javax.management.MBeanOperationInfo;

public class MBeanOperationInfo_3 {
    public static void main(String[] args) {
        MBeanOperationInfo operationInfo = new MBeanOperationInfo("operationName", "operationDescription", null, "int", MBeanOperationInfo.INFO);
        int impact = operationInfo.getImpact();
        System.out.println("Impact: " + impact);
    }
}
