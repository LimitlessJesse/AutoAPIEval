import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_4 {
    public static void main(String[] args) {
        Container container = new Container();
        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        // Add components to the container
        container.add("Component1", new Component1());
        container.add("Component2", new Component2());

        // Flip to the last card
        cardLayout.last(container);
    }
}
