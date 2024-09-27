import javax.swing.event.TreeSelectionEvent;

public class TreeSelectionEvent_3 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(new Object(), null, true, null, null);
        boolean addedPath = event.isAddedPath();
        System.out.println("isAddedPath: " + addedPath);
    }
}
