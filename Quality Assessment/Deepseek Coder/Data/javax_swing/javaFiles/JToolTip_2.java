import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolTip;
import java.awt.Dimension;

public class JToolTip_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Hover me");
        button.setToolTipText("This is a tooltip");
        frame.add(button);

        frame.setVisible(true);

        JToolTip toolTip = button.getToolTipText();
        String tipText = toolTip.getTipText();
        System.out.println(tipText);
    }
}
