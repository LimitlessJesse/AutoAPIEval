import javax.management.openmbean.OpenMBeanParameterInfoSupport;

public class OpenMBeanParameterInfoSupport_5 {
    public static void main(String[] args) {
        OpenMBeanParameterInfoSupport paramInfo = new OpenMBeanParameterInfoSupport("paramName", "paramType", "paramDescription");
        boolean hasDefault = paramInfo.hasDefaultValue();
        System.out.println("Parameter has default value: " + hasDefault);
    }
}
