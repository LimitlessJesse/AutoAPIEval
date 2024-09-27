import java.util.EventObject;

public class EventObject_1 {
    public static void main(String[] args) {
        EventObject event = new EventObject(new Object());
        Object source = event.getSource();
        System.out.println("Event initially occurred on: " + source);
    }
}
