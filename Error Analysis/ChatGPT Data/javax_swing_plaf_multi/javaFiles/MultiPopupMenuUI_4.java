import javax.swing.plaf.multi.MultiPopupMenuUI;
import java.awt.event.MouseEvent;

public class MultiPopupMenuUI_4 {
    public static void main(String[] args) {
        // Create an instance of a MouseEvent object
        MouseEvent event = new MouseEvent(); 
        
        // Check if the MouseEvent object triggers a popup
        MultiPopupMenuUI.isPopupTrigger(event);
    }
}
