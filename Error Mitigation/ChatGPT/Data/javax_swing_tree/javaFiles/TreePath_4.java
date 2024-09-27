import javax.swing.tree.TreePath;

public class TreePath_4 {
    public static void main(String[] args) {
        Object[] pathElements = {"Parent", "Child1", "Child2"};
        TreePath path = new TreePath(pathElements);
        
        Object newChild = "NewChild";
        TreePath newPath = path.pathByAddingChild(newChild);
        
        for (Object element : newPath.getPath()) {
            System.out.println(element);
        }
    }
}
