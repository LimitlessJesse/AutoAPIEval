import java.beans.beancontext.BeanContextSupport;

public class BeanContextSupport_BCSIterator_2 {
    public static void main(String[] args) {
        BeanContextSupport.BCSIterator iterator = new BeanContextSupport.BCSIterator();
        Object nextElement = iterator.next();
        System.out.println("Next element: " + nextElement);
    }
}
