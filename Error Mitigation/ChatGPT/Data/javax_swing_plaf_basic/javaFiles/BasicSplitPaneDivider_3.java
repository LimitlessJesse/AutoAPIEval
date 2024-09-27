import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class BasicSplitPaneDivider_3 {
    public static void main(String[] args) {
        BasicSplitPaneDivider divider = new BasicSplitPaneDivider();
        BasicSplitPaneUI ui = new BasicSplitPaneUI();
        
        divider.setBasicSplitPaneUI(ui);
    }
}
