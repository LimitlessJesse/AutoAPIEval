import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTableHeaderUI_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("SynthTableHeaderUI Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JTable table = new JTable(5, 5);
                SynthTableHeaderUI headerUI = new SynthTableHeaderUI();
                headerUI.paint(table.getGraphics(), table);

                frame.add(new JScrollPane(table), BorderLayout.CENTER);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
