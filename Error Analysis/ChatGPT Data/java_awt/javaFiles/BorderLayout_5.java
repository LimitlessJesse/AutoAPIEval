import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BorderLayout_5 {
    public static void main(String[] args) {
        // Create a Container
        Container container = new Container();
        
        // Call preferredLayoutSize method with BorderLayout
        Dimension preferredSize = container.preferredLayoutSize(new BorderLayout());
        
        // Print the preferred size
        System.out.println("Preferred Size: " + preferredSize);
    }
}
