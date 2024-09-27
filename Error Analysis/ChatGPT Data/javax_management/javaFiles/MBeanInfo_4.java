import javax.management.MBeanConstructorInfo;

public class MBeanInfo_4 {
    public static void main(String[] args) {
        // Assuming you have an instance of MBeanInfo called mBeanInfo
        MBeanConstructorInfo[] constructors = mBeanInfo.getConstructors();
        
        // Work with the MBeanConstructorInfo array as needed
        for (MBeanConstructorInfo constructor : constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            System.out.println("Constructor Description: " + constructor.getDescription());
            System.out.println("Constructor Parameters: " + constructor.getSignature());
        }
    }
}
