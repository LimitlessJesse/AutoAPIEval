import java.awt.Container;
import java.awt.GridLayout;

public class GridLayout_12 {
    public static void main(String[] args) {
        Container container = new Container();
        GridLayout gridLayout = new GridLayout(3, 3);
        container.setLayout(gridLayout);

        for (int i = 0; i < 9; i++) {
            container.add(new Component());
        }

        gridLayout.layoutContainer(container);
    }
}
