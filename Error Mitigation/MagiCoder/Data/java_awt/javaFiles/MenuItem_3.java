import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItem_3 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        });
    }
}
