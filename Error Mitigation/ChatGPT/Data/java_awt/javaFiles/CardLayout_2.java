import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_2 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container parent = new Container(); // Create a parent container
        cardLayout.first(parent); // Flips to the first card of the container
    }
}
