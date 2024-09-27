import java.awt.MenuBar;

public class MenuBar_4 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        menuBar.add(new java.awt.Menu("File"));
        menuBar.add(new java.awt.Menu("Edit"));
        
        int menuCount = menuBar.getMenuCount();
        System.out.println("Menu count: " + menuCount);
    }
}
