import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_4 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");
        root.add(child);
        
        DefaultTreeModel model = new DefaultTreeModel(root);
        
        boolean isLeaf = model.isLeaf(child);
        System.out.println("Is the child node a leaf node? " + isLeaf);
    }
}
