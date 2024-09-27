import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_1 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreePath path = new TreePath(new Object[]{"Root", "Child"});
        model.addSelectionPath(path);
    }
}
