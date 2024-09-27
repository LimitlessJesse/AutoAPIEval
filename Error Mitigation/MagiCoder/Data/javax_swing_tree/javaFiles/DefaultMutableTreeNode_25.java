import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_25 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        System.out.println("Before removal: " + root.getChildCount());

        root.remove(0);

        System.out.println("After removal: " + root.getChildCount());
    }
}
