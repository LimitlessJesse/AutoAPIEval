import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_3 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(source, firstIndex, lastIndex, isAdjusting);
        boolean isAdjusting = event.getValueIsAdjusting();
        System.out.println("Is adjusting: " + isAdjusting);
    }
}
