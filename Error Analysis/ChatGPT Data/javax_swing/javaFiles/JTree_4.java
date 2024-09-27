import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_4 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        root.add(node1);
        root.add(node2);

        tree.setModel(new javax.swing.tree.DefaultTreeModel(root));

        tree.collapseRow(0); // Collapses the root node

        // Additional code to show the JTree
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.add(new javax.swing.JScrollPane(tree));
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
