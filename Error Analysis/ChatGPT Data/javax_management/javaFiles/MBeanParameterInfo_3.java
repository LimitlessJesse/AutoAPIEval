import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_3 {
    public static void main(String[] args) {
        MBeanParameterInfo info = new MBeanParameterInfo("paramName", "paramType", "paramDesc");
        int hashCode = info.hashCode();
        System.out.println("HashCode: " + hashCode);
    }
}
