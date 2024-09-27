import javax.management.modelmbean.RequiredModelMBean;
import javax.management.MBeanException;
import javax.management.RuntimeOperationsException;
import javax.management.InstanceNotFoundException;
import javax.management.InvalidTargetObjectTypeException;

public class RequiredModelMBean_1 {
    public static void main(String[] args) {
        RequiredModelMBean modelMBean = new RequiredModelMBean();
        Object mr = new Object(); // Example managed resource object
        String mr_type = "ObjectReference";

        try {
            modelMBean.setManagedResource(mr, mr_type);
        } catch (MBeanException | RuntimeOperationsException | InstanceNotFoundException | InvalidTargetObjectTypeException e) {
            e.printStackTrace();
        }
    }
}
