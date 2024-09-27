import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;

public class GridLayout_12 {
    public static void main(String[] args) {
        Container container = new Container();
        GridLayout gridLayout = new GridLayout();
        container.setLayout(gridLayout);
        
        Dimension minSize = gridLayout.minimumLayoutSize(container);
        System.out.println("Minimum Layout Size: " + minSize);
    }
}
