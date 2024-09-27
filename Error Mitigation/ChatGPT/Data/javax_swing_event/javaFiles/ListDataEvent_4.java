import javax.swing.event.ListDataEvent;

public class ListDataEvent_4 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, 5);
        int eventType = event.getType();
        System.out.println("Event Type: " + eventType);
    }
}
