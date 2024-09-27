import javax.swing.event.ListSelectionEvent;

public class ListSelectionEvent_1 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent(source, firstIndex, lastIndex, isAdjusting);
        
        int firstIndex = event.getFirstIndex();
        System.out.println("First Index: " + firstIndex);
    }
}
