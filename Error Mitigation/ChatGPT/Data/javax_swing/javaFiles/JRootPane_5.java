import javax.swing.JRootPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JRootPane_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Frame");
        JRootPane rootPane = frame.getRootPane();
        
        JPanel glassPane = new JPanel();
        rootPane.setGlassPane(glassPane);
        glassPane.setVisible(true);
    }
}
