import java.awt.GridLayout;

public class GridLayout_8 {
    public static void main(String[] args) {
        GridLayout layout = new GridLayout(3, 3);
        layout.setHgap(10); // set horizontal gap to 10
        System.out.println(layout.getHgap()); // get horizontal gap
    }
}
