import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;

public class GridBagLayout_3 {
    public static void main(String[] args) {
        GridBagLayout layout = new GridBagLayout();
        Container container = new Container();
        
        Dimension minSize = layout.minimumLayoutSize(container);
        
        System.out.println("Minimum Layout Width: " + minSize.width);
        System.out.println("Minimum Layout Height: " + minSize.height);
    }
}
