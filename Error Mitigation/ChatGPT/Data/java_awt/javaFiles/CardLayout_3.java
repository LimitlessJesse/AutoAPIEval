import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;

public class CardLayout_3 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        JPanel panel = new JPanel();
        panel.setLayout(cardLayout);
        
        // Add cards to the panel
        
        cardLayout.last(panel);
    }
}
