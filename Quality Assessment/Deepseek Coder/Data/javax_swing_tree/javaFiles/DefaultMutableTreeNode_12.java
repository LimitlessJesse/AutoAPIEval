import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class DefaultMutableTreeNode_12 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        
        root.add(child1);
        root.add(child2);
        
        int childCount = root.getChildCount();
        System.out.println("Number of children: " + childCount);
    }
}
