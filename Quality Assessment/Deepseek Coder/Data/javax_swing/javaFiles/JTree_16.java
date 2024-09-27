import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_16 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        JTree tree = new JTree(node);

        // Adding child nodes
        DefaultMutableTreeNode childNode1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("Child 2");
        node.add(childNode1);
        node.add(childNode2);

        // Checking if the tree node is editable
        boolean isChildNode1Editable = tree.isEditable(tree.getPathForRow(0));
        boolean isChildNode2Editable = tree.isEditable(tree.getPathForRow(1));

        System.out.println("Is Child Node 1 editable? " + isChildNode1Editable);
        System.out.println("Is Child Node 2 editable? " + isChildNode2Editable);
    }
}
