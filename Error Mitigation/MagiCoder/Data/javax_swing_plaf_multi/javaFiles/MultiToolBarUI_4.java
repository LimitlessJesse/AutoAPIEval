import javax.swing.*;
import javax.swing.plaf.multi.MultiToolBarUI;
import java.awt.*;

public class MultiToolBarUI_4 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Button 1"));
        toolBar.add(new JButton("Button 2"));

        MultiToolBarUI multiToolBarUI = new MultiToolBarUI();
        multiToolBarUI.paint(toolBar.getGraphics(), toolBar);
    }
}
