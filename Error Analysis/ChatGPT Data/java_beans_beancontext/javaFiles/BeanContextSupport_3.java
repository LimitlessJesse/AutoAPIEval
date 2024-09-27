import java.beans.beancontext.BeanContextSupport;

public class BeanContextSupport_3 {
    public static void main(String[] args) {
        BeanContextSupport beanContextSupport = new BeanContextSupport();
        Object object = new Object();
        boolean containsObject = beanContextSupport.contains(object);
        System.out.println("Contains object: " + containsObject);
    }
}
