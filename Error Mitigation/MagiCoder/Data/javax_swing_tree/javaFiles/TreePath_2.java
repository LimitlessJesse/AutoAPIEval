import javax.swing.tree.TreePath;

public class TreePath_2 {
    public static void main(String[] args) {
        TreePath treePath = new TreePath(new Object[]{"Root", "Child1", "Grandchild1"});
        Object[] path = treePath.getPath();
        for (Object node : path) {
            System.out.println(node);
        }
    }
}
