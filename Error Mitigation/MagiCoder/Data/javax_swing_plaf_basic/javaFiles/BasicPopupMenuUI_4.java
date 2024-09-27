import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuUI;

public class BasicPopupMenuUI_4 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        BasicPopupMenuUI basicPopupMenuUI = new BasicPopupMenuUI();
        basicPopupMenuUI.installUI(popupMenu);
    }
}
