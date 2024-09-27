import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_1 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container parent = new Container();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        parent.addLayoutComponent(button1, "Button 1");
        parent.addLayoutComponent(button2, "Button 2");

        cardLayout.addLayoutComponent(button1, "Button 1");
        cardLayout.addLayoutComponent(button2, "Button 2");

        System.out.println("Parent components: " + parent.getComponents());
        System.out.println("CardLayout components: " + cardLayout.getLayoutComponents());
    }
}
