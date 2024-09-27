import java.beans.MethodDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_3 {
    public static void main(String[] args) {
        // Create an instance of SimpleBeanInfo to work with
        SimpleBeanInfo beanInfo = new SimpleBeanInfo();

        // Get the MethodDescriptors associated with the beanInfo
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();

        // Print out the MethodDescriptors
        for (MethodDescriptor methodDescriptor : methodDescriptors) {
            System.out.println(methodDescriptor.getName());
        }
    }
}
