import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_7 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreePath path = new TreePath(new Object[] {1, 2, 3});
        model.removeSelectionPath(path);
    }
}
