import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_62 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");

        root.add(child1);
        root.add(child2);

        System.out.println("Is root a leaf? " + root.isLeaf()); // false
        System.out.println("Is child1 a leaf? " + child1.isLeaf()); // true
        System.out.println("Is child2 a leaf? " + child2.isLeaf()); // true
    }
}
