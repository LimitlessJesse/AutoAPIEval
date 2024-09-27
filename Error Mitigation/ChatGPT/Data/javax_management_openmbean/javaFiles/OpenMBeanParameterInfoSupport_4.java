import javax.management.openmbean.OpenMBeanParameterInfoSupport;

public class OpenMBeanParameterInfoSupport_4 {
    public static void main(String[] args) {
        OpenMBeanParameterInfoSupport paramInfo = new OpenMBeanParameterInfoSupport("paramName", "paramType", "paramDescription");
        Object defaultValue = paramInfo.getDefaultValue();
        System.out.println("Default Value: " + defaultValue);
    }
}
