import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class TreePath_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");

        root.add(child1);
        root.add(child2);

        TreePath treePath = new TreePath(new int[] {0});
        boolean isDescendant = treePath.isDescendant(new TreePath(root.getPath()));

        System.out.println("Is the tree path a descendant of the root? " + isDescendant);
    }
}
