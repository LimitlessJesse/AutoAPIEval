import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class BasicSplitPaneDivider_3 {
    public static void main(String[] args) {
        JSplitPane splitPane = new JSplitPane();
        BasicSplitPaneDivider divider = new BasicSplitPaneDivider(splitPane);
        divider.setDividerSize(100);
    }
}
