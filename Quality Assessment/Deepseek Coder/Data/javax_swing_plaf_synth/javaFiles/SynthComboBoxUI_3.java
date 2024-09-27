import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthComboBoxUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SynthComboBoxUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        SynthComboBoxUI<String> ui = new SynthComboBoxUI<>();
        ui.installUI(comboBox);

        ui.getPeer().setPaintingCallback(new SynthComboBoxUI.PaintingCallback() {
            @Override
            public void doPaint(Graphics g, JComponent c) {
                super.doPaint(g, c);
                g.setColor(Color.RED);
                g.drawString("Hello, World!!!", 50, 50);
            }
        });

        frame.getContentPane().add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
