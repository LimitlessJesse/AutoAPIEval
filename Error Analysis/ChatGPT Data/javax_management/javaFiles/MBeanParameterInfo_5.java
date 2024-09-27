import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_5 {
    public static void main(String[] args) {
        MBeanParameterInfo parameterInfo = new MBeanParameterInfo("paramName", "java.lang.String", "Parameter Description");
        System.out.println(parameterInfo.toString());
    }
}
