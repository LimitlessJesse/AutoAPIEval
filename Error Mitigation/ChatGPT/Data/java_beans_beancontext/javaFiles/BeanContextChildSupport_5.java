import java.beans.beancontext.BeanContextChildSupport;

public class BeanContextChildSupport_5 {
    public static void main(String[] args) {
        BeanContextChildSupport support = new BeanContextChildSupport();
        support.firePropertyChange("propertyName", "oldValue", "newValue");
    }
}
