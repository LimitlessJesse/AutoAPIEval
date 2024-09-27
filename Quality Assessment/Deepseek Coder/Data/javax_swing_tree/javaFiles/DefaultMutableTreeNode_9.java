import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_9 {
    public static void main(String[] args) {
        // Create a tree node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add child nodes to root node
        root.add(child1);
        root.add(child2);

        // Remove child node at index 0
        root.remove(0);

        // Print remaining child nodes
        for (int i = 0; i < root.getChildCount(); i++) {
            System.out.println(root.getChildAt(i).toString());
        }
    }
}
