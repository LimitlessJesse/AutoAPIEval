import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_5 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container parent = new Container(); // Create a parent container
        
        // Add cards to the parent container
        
        // Flips to the previous card
        cardLayout.previous(parent);
    }
}
