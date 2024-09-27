import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeModelEvent_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        TreeModelEvent event = new TreeModelEvent(root, new int[] {0}, new int[] {0}, new Object[] {child1});
        Object[] children = event.getChildren();

        for (Object child : children) {
            System.out.println(((DefaultMutableTreeNode) child).getUserObject());
        }
    }
}
