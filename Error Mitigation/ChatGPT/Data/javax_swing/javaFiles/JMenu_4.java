import javax.swing.JMenu;

public class JMenu_4 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("File");
        menu.add("Open");
        menu.add("Save");
        menu.add("Close");

        System.out.println("Menu items before removeAll: " + menu.getItemCount());

        menu.removeAll();

        System.out.println("Menu items after removeAll: " + menu.getItemCount());
    }
}
