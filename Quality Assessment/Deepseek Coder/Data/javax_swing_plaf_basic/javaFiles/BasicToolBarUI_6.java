import javax.swing.plaf.basic.BasicToolBarUI;
import javax.swing.JToolBar;

public class BasicToolBarUI_6 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        BasicToolBarUI toolBarUI = (BasicToolBarUI) toolBar.getUI();
        toolBarUI.setOrientation(BasicToolBarUI.HORIZONTAL_ORIENTATION);
    }
}
