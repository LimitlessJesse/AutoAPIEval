import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_6 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container container = new Container();

        // Add components to the container
        container.add("Component1");
        container.add("Component2");

        // Show the first component
        cardLayout.first(container);

        // Show the previous component
        cardLayout.previous(container);
    }
}
