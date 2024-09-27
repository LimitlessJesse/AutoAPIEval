import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_5 {
    public static void main(String[] args) {
        MBeanParameterInfo paramInfo = new MBeanParameterInfo("paramName", "paramType", "paramDescription");
        System.out.println(paramInfo.toString());
    }
}
