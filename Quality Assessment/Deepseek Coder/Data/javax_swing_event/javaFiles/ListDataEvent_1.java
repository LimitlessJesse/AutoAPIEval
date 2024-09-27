import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ListDataEvent_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        ListDataEvent event = new ListDataEvent(list, ListDataEvent.INTERVAL_ADDED, 0, 1);

        int eventType = event.getType();

        if (eventType == ListDataEvent.INTERVAL_ADDED) {
            System.out.println("Interval added");
        } else if (eventType == ListDataEvent.INTERVAL_REMOVED) {
            System.out.println("Interval removed");
        } else if (eventType == ListDataEvent.CONTENTS_CHANGED) {
            System.out.println("Contents changed");
        }
    }
}
