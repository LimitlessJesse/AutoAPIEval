import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class DefaultMutableTreeNode_13 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        
        root.addChild(child1);
        root.addChild(child2);
        
        int index = getIndex(child1);
        System.out.println("Index of child1: " + index);
    }
    
    public static int getIndex(TreeNode node) {
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
        if (parent == null) {
            return -1;
        }
        return parent.getIndex(node);
    }
}
