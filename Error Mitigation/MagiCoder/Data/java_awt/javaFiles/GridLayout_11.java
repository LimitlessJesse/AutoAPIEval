import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class GridLayout_11 {
    public static void main(String[] args) {
        Container container = new Container();
        GridLayout gridLayout = new GridLayout(2, 2);
        container.setLayout(gridLayout);

        Dimension minSize = gridLayout.minimumLayoutSize(container);
        System.out.println("Minimum width: " + minSize.width);
        System.out.println("Minimum height: " + minSize.height);
    }
}
