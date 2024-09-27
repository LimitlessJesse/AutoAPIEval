import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_3 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container parent = new Container(); // Example container
        cardLayout.previous(parent);
    }
}
