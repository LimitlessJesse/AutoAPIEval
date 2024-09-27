import javax.swing.*;
import javax.swing.plaf.metal.MetalTreeUI;
import java.awt.*;

public class MetalTreeUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTree tree = new JTree();
        MetalTreeUI treeUI = new MetalTreeUI();

        // Set the tree's UI to the MetalTreeUI
        tree.setUI(treeUI);

        // Create a Graphics object
        Graphics g = frame.getGraphics();

        // Call the paint method
        treeUI.paint(g, tree);
    }
}
