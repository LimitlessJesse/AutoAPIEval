import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_4 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        treeModel.insertNodeInto(child1, root, 0);
        treeModel.insertNodeInto(child2, root, 1);

        System.out.println("Before removing node:");
        printTree(root);

        removeNodeFromParent(child1, treeModel);

        System.out.println("\nAfter removing node:");
        printTree(root);
    }

    public static void removeNodeFromParent(DefaultMutableTreeNode node, DefaultTreeModel treeModel) {
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
        if (parent != null) {
            treeModel.removeNodeFromParent(node);
        }
    }

    public static void printTree(DefaultMutableTreeNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(i);
            System.out.println(child.getUserObject());
            printTree(child);
        }
    }
}
