import java.beans.beancontext.BeanContextMembershipEvent;

public class BeanContextMembershipEvent_4 {
    public static void main(String[] args) {
        BeanContextMembershipEvent event = new BeanContextMembershipEvent(null, null);
        int eventSize = event.size();
        System.out.println("Event size: " + eventSize);
    }
}
