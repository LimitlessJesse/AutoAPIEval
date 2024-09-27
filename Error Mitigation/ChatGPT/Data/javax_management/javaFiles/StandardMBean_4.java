import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.StandardMBean;

public class StandardMBean_4 {
    public static void main(String[] args) {
        // Create an MBean instance
        MyMBean mbean = new MyMBean();
        
        // Create a StandardMBean instance
        StandardMBean standardMBean = new StandardMBean(mbean, MyMBeanInterface.class);
        
        // Get the MBeanServer
        MBeanServer mbs = ...; // Obtain the MBeanServer
        
        // Register the StandardMBean with an ObjectName
        ObjectName objectName = ...; // Create an ObjectName
        mbs.registerMBean(standardMBean, objectName);
        
        // Get attributes using getAttributes method
        String[] attributes = {"attribute1", "attribute2"};
        AttributeList attributeList = standardMBean.getAttributes(attributes);
        
        // Print the attributeList
        System.out.println(attributeList);
    }
}

// Sample MBean interface
interface MyMBeanInterface {
    String getAttribute1();
    void setAttribute1(String value);
    int getAttribute2();
    void setAttribute2(int value);
}

// Sample MBean class
class MyMBean implements MyMBeanInterface {
    private String attribute1;
    private int attribute2;
    
    @Override
    public String getAttribute1() {
        return attribute1;
    }
    
    @Override
    public void setAttribute1(String value) {
        attribute1 = value;
    }
    
    @Override
    public int getAttribute2() {
        return attribute2;
    }
    
    @Override
    public void setAttribute2(int value) {
        attribute2 = value;
    }
}
