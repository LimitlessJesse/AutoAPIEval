import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;

public class MBeanOperationInfo_5 {
    public static void main(String[] args) {
        MBeanOperationInfo operationInfo = new MBeanOperationInfo(
            MBeanOperationInfo.ACTION,
            "add",
            "This method appends the specified element to the end of this list.",
            "java.lang.String",
            MBeanParameterInfo.UNKNOWN,
            new MBeanParameterInfo[] {
                new MBeanParameterInfo("e", "java.lang.String", "The element to be added", true, false)
            },
            "add");

        MBeanParameterInfo[] parameters = operationInfo.getSignature();

        for (MBeanParameterInfo parameter : parameters) {
            System.out.println("Parameter Name: " + parameter.getName());
            System.out.println("Parameter Type: " + parameter.getType());
            System.out.println("Parameter Description: " + parameter.getDescription());
            System.out.println("Is isMandatory: " + parameter.isMandatory());
            System.out.println("Is isList: " + parameter.isList());
        }
    }
}
