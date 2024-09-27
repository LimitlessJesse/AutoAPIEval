import javax.swing.*;
import java.awt.*;

public class OverlayLayout_3 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        OverlayLayout overlayLayout = new OverlayLayout(panel);
        panel.setLayout(overlayLayout);

        Dimension preferredSize = overlayLayout.preferredLayoutSize(panel);
        System.out.println("Preferred layout size: " + preferredSize);
    }
}
