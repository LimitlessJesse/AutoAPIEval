import javax.swing.*;
import java.awt.*;

public class OverlayLayout_4 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        OverlayLayout overlayLayout = new OverlayLayout(panel);
        Dimension minimumSize = overlayLayout.minimumLayoutSize(panel);
        System.out.println("Minimum Layout Size: " + minimumSize);
    }
}
