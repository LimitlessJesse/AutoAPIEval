import java.awt.GridLayout;

public class GridLayout_1 {
    public static void main(String[] args) {
        GridLayout gridLayout = new GridLayout();
        int hgap = gridLayout.getHgap();
        System.out.println("Horizontal gap value: " + hgap);
    }
}
