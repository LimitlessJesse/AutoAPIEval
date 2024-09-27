import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTableUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTable table = new JTable(5, 5);
        SynthTableUI synthTableUI = new SynthTableUI();
        BasicTableUI basicTableUI = new BasicTableUI();
        basicTableUI.installUI(table);

        frame.add(table);
        frame.setVisible(true);
    }
}
