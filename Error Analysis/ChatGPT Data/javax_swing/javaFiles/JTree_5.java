import javax.swing.JTree;
import javax.swing.tree.TreePath;

public class JTree_5 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        TreePath path = tree.getPathForRow(0); // Replace 0 with the index of the desired row
        boolean isSelected = tree.isPathSelected(path);
        System.out.println("Is path selected? " + isSelected);
    }
}
