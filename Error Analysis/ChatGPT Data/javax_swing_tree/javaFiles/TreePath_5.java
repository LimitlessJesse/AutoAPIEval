import javax.swing.tree.TreePath;

public class TreePath_5 {
    public static void main(String[] args) {
        Object[] pathElements = {"Parent", "Child1", "Child2"};
        TreePath treePath = new TreePath(pathElements);
        
        Object element = treePath.getPathComponent(1);
        System.out.println("Element at index 1: " + element);
    }
}
