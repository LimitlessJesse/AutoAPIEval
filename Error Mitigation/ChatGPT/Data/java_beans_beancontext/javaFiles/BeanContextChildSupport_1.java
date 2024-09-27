import java.beans.beancontext.BeanContextChildSupport;

public class BeanContextChildSupport_1 {
    public static void main(String[] args) {
        BeanContextChildSupport support = new BeanContextChildSupport();
        BeanContextChild peer = support.getBeanContextChildPeer();
        System.out.println(peer);
    }
}
