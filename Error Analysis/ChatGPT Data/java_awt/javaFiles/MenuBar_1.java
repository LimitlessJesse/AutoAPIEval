import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_1 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        
        System.out.println("Menu bar: " + menuBar.getMenu(0).getLabel() + ", " + menuBar.getMenu(1).getLabel());
    }
}
