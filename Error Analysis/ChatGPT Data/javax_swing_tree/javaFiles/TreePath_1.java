import javax.swing.tree.TreePath;

public class TreePath_1 {
    public static void main(String[] args) {
        Object[] path = {"Root", "Child1", "Child2"};
        TreePath treePath = new TreePath(path);

        Object lastPathComponent = treePath.getLastPathComponent();
        System.out.println("Last path component: " + lastPathComponent);
    }
}
