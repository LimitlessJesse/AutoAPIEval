import javax.naming.event.NamingEvent;

public class NamingEvent_2 {
    public static void main(String[] args) {
        NamingEvent event = new NamingEvent(this, NamingEvent.OBJECT_ADDED, "Object added");
        int eventType = event.getType();
        System.out.println("Event Type: " + eventType);
    }
}
