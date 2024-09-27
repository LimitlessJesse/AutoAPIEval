import javax.swing.JToolBar;
import java.awt.Dimension;

public class JToolBar_Separator_8 {
    public static void main(String[] args) {
        JToolBar.Separator separator = new JToolBar.Separator();
        Dimension preferredSize = separator.getPreferredSize();
        System.out.println("Preferred Size: " + preferredSize);
    }
}
