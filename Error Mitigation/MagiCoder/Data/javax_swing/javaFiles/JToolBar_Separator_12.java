import javax.swing.JToolBar;
import java.awt.Dimension;

public class JToolBar_Separator_12 {
    public static void main(String[] args) {
        JToolBar.Separator separator = new JToolBar.Separator();
        Dimension maxSize = separator.getMaximumSize();
        System.out.println("Maximum Size: " + maxSize);
    }
}
