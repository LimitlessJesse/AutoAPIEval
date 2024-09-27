import java.awt.*;
import java.awt.event.*;

public class TrayIcon_5 {
    public static void main(String[] args) {
        // Create a system tray
        SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu
        PopupMenu popup = new PopupMenu();

        // Create a menu item
        MenuItem item = new MenuItem("Item");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item selected");
            }
        });

        // Add the menu item to the popup menu
        popup.add(item);

        // Create a tray icon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"));

        // Set the popup menu for the tray icon
        trayIcon.setPopupMenu(popup);

        // Add the tray icon to the system tray
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
