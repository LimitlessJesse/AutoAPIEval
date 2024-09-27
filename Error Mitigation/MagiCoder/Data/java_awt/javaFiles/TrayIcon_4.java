import java.awt.*;
import java.awt.event.*;

public class TrayIcon_4 {
    public static void main(String[] args) {
        // Create a system tray
        SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu
        PopupMenu popup = new PopupMenu();

        // Create a menu item
        MenuItem item = new MenuItem("Menu Item");

        // Add the menu item to the popup menu
        popup.add(item);

        // Create a tray icon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"), "Tray Demo", popup);

        // Set the tooltip
        trayIcon.setToolTip("This is a tooltip");

        // Add the tray icon to the system tray
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
