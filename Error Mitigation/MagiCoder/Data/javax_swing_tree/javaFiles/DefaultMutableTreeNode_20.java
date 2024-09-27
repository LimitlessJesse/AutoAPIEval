import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_20 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        // Set allowsChildren to false
        child1.setAllowsChildren(false);

        // Now, child1 should not have any children
        System.out.println(child1.getChildCount()); // Output: 0
    }
}
