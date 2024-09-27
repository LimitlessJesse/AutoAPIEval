import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class BorderFactory_1 {
    public static void main(String[] args) {
        int top = 10;
        int left = 5;
        int bottom = 10;
        int right = 5;
        
        Border emptyBorder = BorderFactory.createEmptyBorder(top, left, bottom, right);
        // Use the emptyBorder in your Swing components
    }
}
