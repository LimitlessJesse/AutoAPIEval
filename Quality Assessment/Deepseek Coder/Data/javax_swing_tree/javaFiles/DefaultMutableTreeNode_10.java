import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_10 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");
        
        root.add(child); // Adding child to root
        
        ((DefaultMutableTreeNode)child.getParent()).remove(child); // Removing child from root
        
        // Now, child node is not part of the tree
    }
}
