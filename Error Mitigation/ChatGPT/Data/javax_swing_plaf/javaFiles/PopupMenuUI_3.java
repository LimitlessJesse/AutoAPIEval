import javax.swing.plaf.PopupMenuUI;
import java.awt.event.MouseEvent;

public class PopupMenuUI_3 {
    public static void main(String[] args) {
        PopupMenuUI popupMenuUI = new PopupMenuUI() {
            @Override
            public boolean isPopupTrigger(MouseEvent e) {
                // Add your implementation here
                return false;
            }
        };
    }
}
