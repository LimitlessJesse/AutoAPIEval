import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_1 {
    public static void main(String[] args) {
        Container parent = //initialize your parent container here
        String name = "cardName"; // specify the name of the card to show
        CardLayout cardLayout = (CardLayout)(parent.getLayout());
        cardLayout.show(parent, name);
    }
}
