import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthScrollPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.RED);

        scrollPane.setViewportView(panel);

        SynthScrollPaneUI synthScrollPaneUI = new SynthScrollPaneUI();
        BasicScrollPaneUI basicScrollPaneUI = new BasicScrollPaneUI();
        basicScrollPaneUI.installUI(scrollPane);
        basicScrollPaneUI.getViewport().getView().setBackground(Color.BLUE);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
