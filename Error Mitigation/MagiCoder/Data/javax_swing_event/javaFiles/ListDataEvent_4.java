import javax.swing.event.ListDataEvent;

public class ListDataEvent_4 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(null, ListDataEvent.CONTENTS_CHANGED, 0, 0);
        int type = event.getType();
        System.out.println("Event type: " + type);
    }
}
