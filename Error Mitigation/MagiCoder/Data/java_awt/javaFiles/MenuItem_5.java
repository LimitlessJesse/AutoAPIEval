import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItem_5 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("Menu Item");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item clicked!");
            }
        });
        menuItem.addNotify();
    }
}
