import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_15 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        JTree tree = new JTree(node);
        
        // Set the tree to be editable
        tree.setEditable(true);
        
        // Add a child node
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode("Child");
        node.add(childNode);
        
        // Set the tree to be not editable
        tree.setEditable(false);
    }
}
