import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.StandardMBean;

public class MBeanInfo_11 {
    public static void main(String[] args) throws Exception {
        StandardMBean mbean = new StandardMBean(new Object(), new ObjectName("name"));
        MBeanInfo info = mbean.getMBeanInfo();
        System.out.println(info.getClassName());
        System.out.println(info.getDescription());
        System.out.println(info.getHashCode());
    }
}
