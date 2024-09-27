import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;

public class TreeSelectionEvent_3 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(new Object(), new TreePath(new Object()));
        TreePath path = event.getPath();
        System.out.println("First path element: " + path.getPathComponent(0));
    }
}
