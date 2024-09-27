import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_6 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        DefaultTreeModel model = new DefaultTreeModel(root);

        int indexOfChild1 = model.getIndexOfChild(root, child1);
        int indexOfChild2 = model.getIndexOfChild(root, child2);

        System.out.println("Index of Child 1: " + indexOfChild1);
        System.out.println("Index of Child 2: " + indexOfChild2);
    }
}
