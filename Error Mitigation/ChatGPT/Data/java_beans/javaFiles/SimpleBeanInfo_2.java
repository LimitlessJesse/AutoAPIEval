import java.beans.BeanInfo;
import java.beans.MethodDescriptor;

public class SimpleBeanInfo_2 {
    public static void main(String[] args) {
        BeanInfo beanInfo = new SimpleBeanInfo();
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        
        if(methodDescriptors != null) {
            for(MethodDescriptor methodDescriptor : methodDescriptors) {
                System.out.println(methodDescriptor.getName());
            }
        } else {
            System.out.println("Method information is obtained through automatic analysis.");
        }
    }
}
