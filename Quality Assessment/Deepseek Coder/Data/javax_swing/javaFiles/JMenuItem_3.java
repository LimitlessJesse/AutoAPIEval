import javax.swing.JMenuItem;

public class JMenuItem_3 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        menuItem.setEnabled(true);
        System.out.println("Is menu item enabled? " + menuItem.isEnabled());

        menuItem.setEnabled(false);
        System.out.println("Is menu item enabled after disabling? " + menuItem.isEnabled());
    }
}
