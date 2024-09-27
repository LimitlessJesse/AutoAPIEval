import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_14 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreePath[] paths = new TreePath[2];
        paths[0] = new TreePath(new Object[]{"Root", "Child1"});
        paths[1] = new TreePath(new Object[]{"Root", "Child2"});
        model.setSelectionPaths(paths);
    }
}
