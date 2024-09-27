import javax.swing.JToolBar;
import java.awt.Dimension;

public class JToolBar_Separator_10 {
    public static void main(String[] args) {
        JToolBar.Separator separator = new JToolBar.Separator();
        Dimension minSize = separator.getMinimumSize();
        System.out.println("Minimum Size: " + minSize);
    }
}
