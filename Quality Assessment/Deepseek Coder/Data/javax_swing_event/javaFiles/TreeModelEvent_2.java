import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeModelEvent_2 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        TreeModel model = root;
        TreePath path = new TreePath(new int[] { 0 });

        TreeModelEvent event = new TreeModelEvent(model, path);
        int[] childIndices = event.getChildIndices();

        for (int index : childIndices) {
            System.out.println(index);
        }
    }
}
