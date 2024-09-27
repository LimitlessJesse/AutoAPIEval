import java.beans.beancontext.BeanContextSupport;
import java.beans.beancontext.BeanContextChildSupport;

public class BeanContextSupport_BCSIterator_3 {
    public static void main(String[] args) {
        BeanContextSupport bcs = new BeanContextSupport();
        BeanContextChildSupport bccs = new BeanContextChildSupport(bcs);
        bcs.addChild(bccs);
        BeanContextSupport.BCSIterator iterator = bcs.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof BeanContextChildSupport) {
                iterator.remove();
            }
        }
    }
}
