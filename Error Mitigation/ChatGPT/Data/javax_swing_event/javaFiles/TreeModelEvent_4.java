import javax.swing.event.TreeModelEvent;
import javax.swing.tree.TreePath;

public class TreeModelEvent_4 {
    public static void main(String[] args) {
        // Create a TreeModelEvent object
        TreeModelEvent event = new TreeModelEvent(this, new TreePath(new Object[]{"parent", "child"}));

        // Get the TreePath using getTreePath() method
        TreePath treePath = event.getTreePath();

        // Print the TreePath
        System.out.println("TreePath: " + treePath);
    }
}
