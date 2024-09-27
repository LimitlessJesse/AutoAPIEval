import java.beans.beancontext.BeanContextMembershipEvent;

public class BeanContextMembershipEvent_3 {
    public static void main(String[] args) {
        BeanContextMembershipEvent event = new BeanContextMembershipEvent();
        int size = event.size();
        System.out.println("Number of children affected: " + size);
    }
}
