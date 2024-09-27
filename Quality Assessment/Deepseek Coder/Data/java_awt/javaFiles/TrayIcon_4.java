import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrayIcon_4 {
    public static void main(String[] args) {
        // Check if system supports tray icon
        if (!SystemTray.isSupported()) {
            System.out.println("System tray not supported");
            return;
        }

        // Create a popup menu
        PopupMenu popup = new PopupMenu();

        // Create a menu item
        MenuItem menuItem = new MenuItem("Exit");

        // Add action listener to the menu item
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add menu item to the popup menu
        popup.add(menuItem);

        // Create a tray icon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"), "Tray Demo", popup);

        // Add action listener to the tray icon
        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tray icon clicked");
            }
        });

        // Get the system tray
        SystemTray tray = SystemTray.getSystemTray();

        // Add the tray icon to the system tray
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("Failed to add tray icon");
        }
    }
}
