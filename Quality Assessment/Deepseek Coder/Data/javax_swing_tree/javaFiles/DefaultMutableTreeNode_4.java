import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_4 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");
        
        root.setAllowsChildren(true); // Set root to allow children
        root.add(child); // Add child to root
        
        System.out.println(root.isLeaf()); // Prints false
        System.out.println(child.isLeaf()); // Prints true
    }
}
