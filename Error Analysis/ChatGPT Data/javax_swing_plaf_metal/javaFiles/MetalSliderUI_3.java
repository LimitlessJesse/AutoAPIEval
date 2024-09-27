import javax.swing.plaf.metal.MetalSliderUI;
import javax.swing.*;
import java.awt.*;

public class MetalSliderUI_3 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a MetalSliderUI instance
        MetalSliderUI metalSliderUI = new MetalSliderUI();
        
        // Create a JPanel to paint the thumb of the slider
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                // Call the paintThumb method of MetalSliderUI to paint the thumb
                metalSliderUI.paintThumb(g);
            }
        };
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Display the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
