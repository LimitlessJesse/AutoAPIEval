import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_3 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(null, 0, 1, true);
        int firstIndex = event.getFirstIndex();
        System.out.println("The first index is: " + firstIndex);
    }
}
