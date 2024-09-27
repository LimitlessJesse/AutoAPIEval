import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.SimpleBeanInfo;
import java.beans.MethodDescriptor;

public class SimpleBeanInfo_5 {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = new SimpleBeanInfo().getBeanDescriptor();
            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();

            for (MethodDescriptor methodDescriptor : methodDescriptors) {
                System.out.println(methodDescriptor.getName() + ": " + methodDescriptor.getShortDescription());
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
