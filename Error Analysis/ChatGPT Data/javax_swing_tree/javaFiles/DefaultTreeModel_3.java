import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class DefaultTreeModel_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("Parent Node");
        DefaultTreeModel treeModel = new DefaultTreeModel(parent);
        
        MutableTreeNode newChild = new DefaultMutableTreeNode("Child Node");
        treeModel.insertNodeInto(newChild, parent, 0);
        
        System.out.println("Parent Node Children Count: " + parent.getChildCount());
    }
}
