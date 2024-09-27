import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ListDataEvent_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        ListDataEvent event = new ListDataEvent(list, ListDataEvent.INTERVAL_ADDED, 0, 1);
        int index = event.getIndex0();

        System.out.println("The index is: " + index);
    }
}
