import javax.swing.*;

public class OverlayLayout_2 {
    public static void main(String[] args) {
        // Create a JFrame to test OverlayLayout
        JFrame frame = new JFrame();
        Container contentPane = frame.getContentPane();
        OverlayLayout overlayLayout = new OverlayLayout(contentPane);
        contentPane.setLayout(overlayLayout);

        // Validate layout
        overlayLayout.invalidateLayout(contentPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
