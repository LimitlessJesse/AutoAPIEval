import java.awt.event.InvocationEvent;

public class InvocationEvent_1 {
    public static void main(String[] args) {
        InvocationEvent event = new InvocationEvent(this, null);
        event.dispatch();
    }
}
