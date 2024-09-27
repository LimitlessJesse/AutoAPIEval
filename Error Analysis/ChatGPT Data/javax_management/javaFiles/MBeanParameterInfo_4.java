import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_4 {
    public static void main(String[] args) {
        MBeanParameterInfo paramInfo1 = new MBeanParameterInfo("param1", "int", "description");
        MBeanParameterInfo paramInfo2 = new MBeanParameterInfo("param1", "int", "description");
        
        System.out.println(paramInfo1.equals(paramInfo2)); // Output will be true
    }
}
