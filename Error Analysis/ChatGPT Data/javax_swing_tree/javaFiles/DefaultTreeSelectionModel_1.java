import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_1 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        
        // Add some sample TreePaths to the selection model
        TreePath path1 = new TreePath(new Object[]{"Parent", "Child1"});
        TreePath path2 = new TreePath(new Object[]{"Parent", "Child2"});
        selectionModel.addSelectionPath(path1);
        selectionModel.addSelectionPath(path2);

        // Get the lead selection path
        TreePath leadPath = selectionModel.getLeadSelectionPath();
        System.out.println("Lead selection path: " + leadPath);
    }
}
