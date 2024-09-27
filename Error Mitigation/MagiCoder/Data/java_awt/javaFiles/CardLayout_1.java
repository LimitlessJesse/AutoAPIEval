import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

public class CardLayout_1 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container container = new Container();

        Component component1 = new Component();
        Component component2 = new Component();

        cardLayout.addLayoutComponent(component1, "Component1");
        cardLayout.addLayoutComponent(component2, "Component2");

        container.add(component1);
        container.add(component2);
    }
}
