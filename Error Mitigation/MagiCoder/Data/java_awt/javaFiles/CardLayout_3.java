import java.awt.CardLayout;
import java.awt.Container;

public class CardLayout_3 {
    public static void main(String[] args) {
        Container parent = new Container();
        CardLayout layout = new CardLayout();
        parent.setLayout(layout);
        
        // Add components to the parent container
        parent.add("Component1", new Component1());
        parent.add("Component2", new Component2());
        
        // Flip to the first card
        layout.first(parent);
    }
}
