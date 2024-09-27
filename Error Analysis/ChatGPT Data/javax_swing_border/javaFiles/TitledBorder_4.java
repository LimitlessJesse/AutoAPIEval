import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class TitledBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title Justification Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("Title");
        border.setTitleJustification(TitledBorder.CENTER);
        panel.setBorder(border);
        
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
