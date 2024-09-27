import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeSelectionEvent_1 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        TreeSelectionEvent event = new TreeSelectionEvent(null, new TreePath(new Object[] {root, child1}));
        TreePath treePath = event.getPath();

        System.out.println(treePath.getPathCount()); // prints 2
        System.out.println(treePath.getLastPathComponent()); // prints "Child 1"
    }
}
