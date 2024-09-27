import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_4 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreePath path = new TreePath("yourTreePathHere");
        boolean isSelected = model.isPathSelected(path);
        System.out.println("Is path selected: " + isSelected);
    }
}
