import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

public class CardLayout_3 {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        Container container = cardLayout.makeLayout(new Container());
        Dimension minSize = cardLayout.minimumLayoutSize(container);
        System.out.println("Minimum Layout Width: " + minSize.width);
        System.out.println("Minimum Layout Height: " + minSize.height);
    }
}
