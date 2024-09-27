import javax.swing.JSplitPane;

public class JSplitPane_3 {
    public static void main(String[] args) {
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOneTouchExpandable(true);
        System.out.println("One touch expandable set to: " + splitPane.isOneTouchExpandable());
    }
}
