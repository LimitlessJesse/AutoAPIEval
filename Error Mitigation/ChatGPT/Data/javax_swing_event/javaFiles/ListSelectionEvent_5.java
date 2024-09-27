import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_5 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(this, 0, 1, false);
        System.out.println(event.toString());
    }
}
