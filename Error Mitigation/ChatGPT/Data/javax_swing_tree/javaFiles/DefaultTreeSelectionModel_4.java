import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_4 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel treeSelectionModel = new DefaultTreeSelectionModel();
        
        // Creating an array of TreePath objects
        TreePath[] paths = new TreePath[2];
        paths[0] = new TreePath(new Object[]{"root", "node1"});
        paths[1] = new TreePath(new Object[]{"root", "node2"});
        
        // Setting the selection paths
        treeSelectionModel.setSelectionPaths(paths);
        
        // Getting the selected paths
        TreePath[] selectedPaths = treeSelectionModel.getSelectionPaths();
        
        // Displaying the selected paths
        for(TreePath path : selectedPaths) {
            System.out.println(path);
        }
    }
}
