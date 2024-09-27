import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class TreeModelEvent_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        TreeModelEvent event = new TreeModelEvent(this, new Object[]{root});

        Object[] children = event.getChildren();

        for (Object child : children) {
            DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) child;
            System.out.println(treeNode.getUserObject());
        }
    }
}
