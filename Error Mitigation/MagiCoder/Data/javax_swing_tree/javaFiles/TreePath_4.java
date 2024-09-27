import javax.swing.tree.TreePath;

public class TreePath_4 {
    public static void main(String[] args) {
        TreePath treePath = new TreePath(new Object[]{"Root", "Child1", "Grandchild1"});
        Object lastComponent = treePath.getLastPathComponent();
        System.out.println(lastComponent);
    }
}
