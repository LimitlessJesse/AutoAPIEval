import java.awt.GridLayout;

public class GridLayout_6 {
    public static void main(String[] args) {
        GridLayout layout = new GridLayout(3, 2); // 3 rows and 2 columns
        int columns = layout.getColumns();
        System.out.println("Number of columns: " + columns);
    }
}
