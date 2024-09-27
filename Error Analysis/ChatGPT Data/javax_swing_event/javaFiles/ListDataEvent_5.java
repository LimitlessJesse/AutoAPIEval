import javax.swing.event.ListDataEvent;

public class ListDataEvent_5 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, 5);
        System.out.println(event.toString());
    }
}
