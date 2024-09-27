import javax.swing.*;

public class JMenuBar_2 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");

        menuBar.add(menu1);
        menuBar.add(menu2);

        JMenu menuAtIndex1 = menuBar.getMenu(1);
        System.out.println("Menu at index 1: " + menuAtIndex1.getText());
    }
}
