import javax.swing.plaf.basic.BasicSplitPaneDivider;
import java.awt.Dimension;

public class BasicSplitPaneDivider_5 {
    public static void main(String[] args) {
        BasicSplitPaneDivider divider = new BasicSplitPaneDivider();
        Dimension preferredSize = divider.getPreferredSize();
        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
