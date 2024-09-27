import java.beans.beancontext.BeanContextSupport;

public class BeanContextSupport_1 {
    public static void main(String[] args) {
        BeanContextSupport support = new BeanContextSupport();
        Object objectToRemove = new Object();
        boolean removed = support.remove(objectToRemove);
        System.out.println("Object removed: " + removed);
    }
}
