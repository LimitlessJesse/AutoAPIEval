import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTreeUI_3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("SynthTreeUI Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                SynthStyle style = SynthUtils.getStyle(UIManager.getLookAndFeel().getDefaults());
                SynthTreeUI treeUI = new SynthTreeUI();
                treeUI.install(new JTree());

                JPanel panel = new JPanel(new BorderLayout()) {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        treeUI.paint(g, getComponent(0));
                        g.setColor(Color.RED);
                        g.drawRect(50, 50, 100, 100);
                    }
                };
                panel.add(new JScrollPane(treeUI.getTree()));
                frame.getContentPane().add(panel);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
