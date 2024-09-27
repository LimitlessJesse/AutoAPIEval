import java.awt.MenuItem;

public class MenuItem_1 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.setLabel("File");
        System.out.println("Menu item label: " + menuItem.getLabel());
    }
}
