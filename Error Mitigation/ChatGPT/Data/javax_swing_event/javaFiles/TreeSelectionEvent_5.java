import javax.swing.event.TreeSelectionEvent;

public class TreeSelectionEvent_5 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(new Object(), null, false, null, null);
        boolean addedPath = event.isAddedPath();
        System.out.println("Path added to selection: " + addedPath);
    }
}
