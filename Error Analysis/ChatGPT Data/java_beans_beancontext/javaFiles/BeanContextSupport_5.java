import java.beans.beancontext.BeanContextSupport;
import java.util.Iterator;

public class BeanContextSupport_5 {
    public static void main(String[] args) {
        BeanContextSupport beanContextSupport = new BeanContextSupport();
        
        Iterator iterator = beanContextSupport.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
