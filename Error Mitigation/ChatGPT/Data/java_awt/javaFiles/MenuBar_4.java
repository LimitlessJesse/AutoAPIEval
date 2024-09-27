import java.awt.MenuBar;

public class MenuBar_4 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        menuBar.add(new Menu("File"));
        menuBar.add(new Menu("Edit"));
        
        int menuCount = menuBar.getMenuCount();
        System.out.println("Number of menus on the menu bar: " + menuCount);
    }
}
