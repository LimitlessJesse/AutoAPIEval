import java.beans.MethodDescriptor;
import java.beans.SimpleBeanInfo;

public class SimpleBeanInfo_4 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            @Override
            public MethodDescriptor[] getMethodDescriptors() {
                return super.getMethodDescriptors();
            }
        };

        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();

        for (MethodDescriptor methodDescriptor : methodDescriptors) {
            System.out.println(methodDescriptor.getName() + ": " + methodDescriptor.getMethod());
        }
    }
}
