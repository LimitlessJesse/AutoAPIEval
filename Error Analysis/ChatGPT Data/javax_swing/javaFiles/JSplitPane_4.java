import javax.swing.JSplitPane;

public class JSplitPane_4 {
    public static void main(String[] args) {
        JSplitPane splitPane = new JSplitPane();
        boolean continuousLayout = splitPane.isContinuousLayout();
        System.out.println("Current continuous layout value: " + continuousLayout);
        
        splitPane.setContinuousLayout(false);
        
        continuousLayout = splitPane.isContinuousLayout();
        System.out.println("Updated continuous layout value: " + continuousLayout);
    }
}
