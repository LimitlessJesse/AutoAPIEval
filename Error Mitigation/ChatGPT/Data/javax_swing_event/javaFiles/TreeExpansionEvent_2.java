import javax.swing.event.TreeExpansionEvent;
import javax.swing.tree.TreePath;

public class TreeExpansionEvent_2 {
    public static void main(String[] args) {
        TreeExpansionEvent event = new TreeExpansionEvent(new Object(), new TreePath(new Object()));
        TreePath path = event.getPath();
        System.out.println("Path: " + path);
    }
}
