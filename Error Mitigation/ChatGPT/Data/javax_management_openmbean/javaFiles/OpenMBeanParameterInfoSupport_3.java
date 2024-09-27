import javax.management.openmbean.OpenType;
import javax.management.openmbean.OpenMBeanParameterInfoSupport;

public class OpenMBeanParameterInfoSupport_3 {
    public static void main(String[] args) {
        OpenMBeanParameterInfoSupport parameterInfo = new OpenMBeanParameterInfoSupport("paramName", "paramDescription", OpenType.STRING);
        OpenType<?> openType = parameterInfo.getOpenType();
        System.out.println("Open Type: " + openType);
    }
}
