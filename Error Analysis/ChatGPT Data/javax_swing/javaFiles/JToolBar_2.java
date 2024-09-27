import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JToolBar_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JToolBar Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JToolBar toolBar = new JToolBar();
            
            JButton button1 = new JButton("Button 1");
            toolBar.add(button1);
            
            toolBar.addSeparator();
            
            JButton button2 = new JButton("Button 2");
            toolBar.add(button2);
            
            frame.add(toolBar);
            
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
