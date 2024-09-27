import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;

public class BasicTreeUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTree tree = new JTree();
        BasicTreeUI treeUI = new BasicTreeUI();

        treeUI.paint(frame.getGraphics(), tree);
    }
}
