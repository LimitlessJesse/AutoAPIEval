import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.StandardMBean;

public class MBeanInfo_10 {
    public static void main(String[] args) throws Exception {
        StandardMBean mbean1 = new StandardMBean(new MyBean(), MyMBean.class, true);
        ObjectName name1 = new ObjectName("com.example:type=MyBean");
        mbean1.setObjectName(name1);

        StandardMBean mbean2 = new StandardMBean(new MyBean(), MyMBean.class, true);
        ObjectName name2 = new ObjectName("com.example:type=MyBean");
        mbean2.setObjectName(name2);

        MBeanInfo info1 = mbean1.getMBeanInfo();
        MBeanInfo info2 = mbean2.getMBeanInfo();

        boolean isEqual = info1.equals(info2);
        System.out.println("Are MBeanInfo objects equal? " + isEqual);
    }
}

class MyBean {
    // Some methods and attributes here...
}

interface MyMBean {
    // Some methods here...
}
