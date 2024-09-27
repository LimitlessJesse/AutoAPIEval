import javax.swing.tree.TreePath;

public class TreePath_3 {
    public static void main(String[] args) {
        Object[] elements = { "Root", "Child1", "Child2" };
        TreePath treePath = new TreePath(elements);
        
        Object[] path = treePath.getPath();
        
        for (Object element : path) {
            System.out.println(element);
        }
    }
}
