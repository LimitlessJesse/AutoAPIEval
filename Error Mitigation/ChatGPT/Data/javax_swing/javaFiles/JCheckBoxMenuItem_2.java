import javax.swing.JCheckBoxMenuItem;

public class JCheckBoxMenuItem_2 {
    public static void main(String[] args) {
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Check Box Item");
        boolean state = checkBoxMenuItem.getState();
        System.out.println("State: " + state);
    }
}
