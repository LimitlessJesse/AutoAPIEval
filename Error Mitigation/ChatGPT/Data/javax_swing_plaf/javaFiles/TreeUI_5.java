import javax.swing.JTree;
import javax.swing.tree.TreePath;
import javax.swing.plaf.TreeUI;

public class TreeUI_5 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        TreeUI ui = tree.getUI();
        int x = 10;
        int y = 20;
        TreePath closestPath = ui.getClosestPathForLocation(tree, x, y);
        System.out.println("Closest path: " + closestPath);
    }
}
