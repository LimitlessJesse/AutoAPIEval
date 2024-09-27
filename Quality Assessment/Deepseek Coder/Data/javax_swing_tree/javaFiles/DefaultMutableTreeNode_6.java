import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class DefaultMutableTreeNode_6 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        node1.setParent(node2); // node1 is now a child of node2

        System.out.println(node1.getParent() == node2); // prints: true
    }
}
