import javax.swing.*;
import javax.swing.plaf.multi.MultiListUI;
import java.awt.*;

public class MultiListUI_4 {
    public static void main(String[] args) {
        // Create a JComponent
        JComponent component = new JPanel();
        
        // Create a Graphics object
        Graphics graphics = component.getGraphics();
        
        // Create an instance of MultiListUI
        MultiListUI multiListUI = new MultiListUI();
        
        // Call the paint method
        multiListUI.paint(graphics, component);
    }
}
