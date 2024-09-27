import javax.swing.event.TreeModelEvent;
import javax.swing.tree.TreePath;

public class TreeModelEvent_3 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(this, new TreePath(new Object[]{"parent", "child"}));
        TreePath path = event.getTreePath();
        System.out.println("Tree path: " + path);
    }
}
