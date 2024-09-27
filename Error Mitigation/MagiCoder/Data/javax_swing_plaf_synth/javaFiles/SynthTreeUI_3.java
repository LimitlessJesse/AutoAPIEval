import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTreeUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JTree tree = new JTree();
        SynthTreeUI treeUI = new SynthTreeUI();
        treeUI.paint(tree.getGraphics(), tree);

        frame.getContentPane().add(tree);
        frame.setVisible(true);
    }
}
