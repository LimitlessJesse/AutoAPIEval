import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.Dimension;

public class GridBagLayout_2 {
    public static void main(String[] args) {
        Container container = new Container();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);
        
        Dimension preferredSize = layout.preferredLayoutSize(container);
        System.out.println("Preferred Layout Width: " + preferredSize.width);
        System.out.println("Preferred Layout Height: " + preferredSize.height);
    }
}
