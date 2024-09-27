import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_2 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(source, firstIndex, lastIndex, isAdjusting);
        
        int lastSelectedIndex = event.getLastIndex();
        System.out.println("Last selected index: " + lastSelectedIndex);
    }
}
