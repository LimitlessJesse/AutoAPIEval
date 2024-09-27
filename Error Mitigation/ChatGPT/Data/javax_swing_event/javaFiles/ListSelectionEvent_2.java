import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_2 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(this, 0, 5, false);
        int lastIndex = event.getLastIndex();
        System.out.println("Last Index: " + lastIndex);
    }
}
