import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class DefaultMutableTreeNode_8 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");

        // Add child1 at index 0
        root.insertNodeInto(child1, 0);

        // Add child2 at index 1
        root.insertNodeInto(child2, 1);

        // Print the tree
        printTree(root);
    }

    public static void printTree(MutableTreeNode node) {
        System.out.println(node.toString());
        for (int i = 0; i < node.getChildCount(); i++) {
            printTree((MutableTreeNode) node.getChildAt(i));
        }
    }
}
