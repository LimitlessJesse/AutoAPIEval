import java.beans.beancontext.BeanContextMembershipEvent;

public class BeanContextMembershipEvent_4 {
    public static void main(String[] args) {
        BeanContextMembershipEvent event = new BeanContextMembershipEvent(null, null);
        Object child = new Object(); // specify the child object to check
        boolean isAffected = event.contains(child);
        System.out.println("Is the child affected by the event? " + isAffected);
    }
}
