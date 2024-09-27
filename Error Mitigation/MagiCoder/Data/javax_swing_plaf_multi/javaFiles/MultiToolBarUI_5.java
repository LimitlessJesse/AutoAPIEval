import javax.swing.*;
import javax.swing.plaf.multi.MultiToolBarUI;
import java.awt.*;

public class MultiToolBarUI_5 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        MultiToolBarUI multiToolBarUI = new MultiToolBarUI();
        Graphics g = toolBar.getGraphics();
        multiToolBarUI.update(g, toolBar);
    }
}
