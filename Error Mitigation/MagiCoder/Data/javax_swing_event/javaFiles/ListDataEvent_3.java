import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ListDataEvent_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        ListDataEvent event = new ListDataEvent(list, ListDataEvent.INTERVAL_ADDED, 0, list.size() - 1);
        int index1 = event.getIndex1();
        System.out.println("Index1: " + index1);
    }
}
