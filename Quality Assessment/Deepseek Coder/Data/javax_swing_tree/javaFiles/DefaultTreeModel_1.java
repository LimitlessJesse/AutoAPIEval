import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_1 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel model = new DefaultTreeModel(root);

        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode("Child");
        model.insertNodeInto(childNode, root, 0);

        DefaultMutableTreeNode rootFromModel = (DefaultMutableTreeNode) model.getRoot();
        System.out.println(rootFromModel.toString());
    }
}
