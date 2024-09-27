import java.beans.beancontext.BeanContextSupport;

public class BeanContextSupport_BCSIterator_1 {
    public static void main(String[] args) {
        BeanContextSupport.BCSIterator iterator = new BeanContextSupport.BCSIterator();
        boolean hasMoreElements = iterator.hasNext();
        System.out.println("Has more elements: " + hasMoreElements);
    }
}
