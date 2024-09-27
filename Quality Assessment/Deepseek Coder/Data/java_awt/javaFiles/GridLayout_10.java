import java.awt.GridLayout;

public class GridLayout_10 {
    public static void main(String[] args) {
        GridLayout layout = new GridLayout(3, 3);
        layout.setVgap(10); // set vertical gap to 10 pixels
        System.out.println(layout.getVgap()); // get vertical gap
    }
}
