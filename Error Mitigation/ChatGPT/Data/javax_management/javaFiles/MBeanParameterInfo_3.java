import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_3 {
    public static void main(String[] args) {
        MBeanParameterInfo parameterInfo = new MBeanParameterInfo("paramName", "paramType", "paramDescription");
        String type = parameterInfo.getType();
        System.out.println("Parameter type: " + type);
    }
}
