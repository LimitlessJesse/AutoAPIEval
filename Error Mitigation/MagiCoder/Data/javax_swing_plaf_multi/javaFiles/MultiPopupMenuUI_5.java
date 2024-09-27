import javax.swing.*;
import javax.swing.plaf.multi.MultiPopupMenuUI;
import java.awt.*;

public class MultiPopupMenuUI_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");
        popupMenu.add("Option 3");

        MultiPopupMenuUI multiPopupMenuUI = new MultiPopupMenuUI();
        multiPopupMenuUI.paint(frame.getGraphics(), popupMenu);
    }
}
