import javax.management.modelmbean.ModelMBeanInfo;
import javax.management.modelmbean.RequiredModelMBean;

public class RequiredModelMBean_2 {
    public static void main(String[] args) {
        RequiredModelMBean modelMBean = new RequiredModelMBean();
        ModelMBeanInfo mbi = new ModelMBeanInfo();
        
        try {
            modelMBean.setModelMBeanInfo(mbi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
