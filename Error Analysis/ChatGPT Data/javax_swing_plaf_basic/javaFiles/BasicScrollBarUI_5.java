import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.Graphics;

public class BasicScrollBarUI_5 {
    public static void main(String[] args) {
        // Instantiate BasicScrollBarUI
        BasicScrollBarUI basicScrollBarUI = new BasicScrollBarUI();
        
        // Call the paintDecreaseHighlight method
        basicScrollBarUI.paintDecreaseHighlight(null); // Passing null as argument for Graphics g
    }
}
