import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class GridLayout_10 {
    public static void main(String[] args) {
        Container container = new Container();
        GridLayout gridLayout = new GridLayout();
        Dimension preferredSize = gridLayout.preferredLayoutSize(container);
        System.out.println("Preferred Width: " + preferredSize.width);
        System.out.println("Preferred Height: " + preferredSize.height);
    }
}
