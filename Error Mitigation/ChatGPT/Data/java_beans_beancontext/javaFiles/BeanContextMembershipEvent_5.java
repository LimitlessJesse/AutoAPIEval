import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.Iterator;

public class BeanContextMembershipEvent_5 {
    public static void main(String[] args) {
        BeanContextMembershipEvent event = new BeanContextMembershipEvent();
        Iterator iterator = event.iterator();
        while(iterator.hasNext()){
            Object child = iterator.next();
            System.out.println(child);
        }
    }
}
