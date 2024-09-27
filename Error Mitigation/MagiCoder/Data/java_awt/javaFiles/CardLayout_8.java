import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_8 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container parent = new Container();
        parent.add("Component1");
        parent.add("Component2");
        cardLayout.show(parent, "Component1");
    }
}
