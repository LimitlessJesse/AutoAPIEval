import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_31 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");

        root.add(child1);
        root.add(child2);

        System.out.println("Before removing: " + root.getChildCount()); // Output: 2

        child1.removeFromParent();

        System.out.println("After removing: " + root.getChildCount()); // Output: 1
    }
}
