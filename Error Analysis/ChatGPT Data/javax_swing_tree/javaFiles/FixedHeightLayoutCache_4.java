import javax.swing.tree.TreePath;
import javax.swing.tree.FixedHeightLayoutCache;

public class FixedHeightLayoutCache_4 {
    public static void main(String[] args) {
        FixedHeightLayoutCache cache = new FixedHeightLayoutCache();

        // Creating a TreePath object
        TreePath path = new TreePath(new Object[]{"A", "B", "C"});

        // Setting the expanded state to true
        cache.setExpandedState(path, true);

        // Getting the expanded state for the path
        boolean isExpanded = cache.getExpandedState(path);
        System.out.println("Is Expanded: " + isExpanded);
    }
}
