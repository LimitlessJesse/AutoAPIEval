import java.awt.GridLayout;

public class GridLayout_3 {
    public static void main(String[] args) {
        GridLayout gridLayout = new GridLayout(2, 2, 10, 20);
        int vgap = gridLayout.getVgap();
        System.out.println("Vertical gap: " + vgap);
    }
}
