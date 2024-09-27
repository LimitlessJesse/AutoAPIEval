import javax.swing.*;
import java.awt.*;

public class OverlayLayout_5 {
    public static void main(String[] args) {
        OverlayLayout overlayLayout = new OverlayLayout(new JPanel());
        Container target = new JPanel();
        Dimension maxLayoutSize = overlayLayout.maximumLayoutSize(target);
        System.out.println("Maximum Layout Size: " + maxLayoutSize);
    }
}
