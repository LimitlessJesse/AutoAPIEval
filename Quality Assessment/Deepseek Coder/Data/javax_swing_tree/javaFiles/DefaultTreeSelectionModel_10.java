import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_10 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        selectionModel.setSelectionPath(root);

        boolean isEmpty = selectionModel.isSelectionEmpty();
        System.out.println("Is selection empty? " + isEmpty);
    }
}
