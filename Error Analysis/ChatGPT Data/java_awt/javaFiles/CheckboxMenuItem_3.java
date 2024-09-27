import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxMenuItem_3 {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckboxMenuItem Example");
        
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("Enable Feature");
        
        checkboxMenuItem.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("CheckboxMenuItem state changed: " + checkboxMenuItem.getState());
            }
        });
        
        menu.add(checkboxMenuItem);
        menuBar.add(menu);
        
        frame.setMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
