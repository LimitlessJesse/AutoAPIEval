import javax.swing.JCheckBoxMenuItem;

public class JCheckBoxMenuItem_1 {
    public static void main(String[] args) {
        JCheckBoxMenuItem menuItem = new JCheckBoxMenuItem("Menu Item");
        menuItem.setState(true); // Set the item as selected
        System.out.println("Is selected: " + menuItem.getState());
    }
}
