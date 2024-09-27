import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;

public class TreeSelectionEvent_4 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(new Object(), new TreePath());
        TreePath[] paths = event.getPaths();
        for (TreePath path : paths) {
            System.out.println(path);
        }
    }
}
