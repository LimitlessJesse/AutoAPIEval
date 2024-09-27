import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_6 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreePath[] paths = model.getSelectionPaths();
        for (TreePath path : paths) {
            System.out.println(path);
        }
    }
}
