import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemTray_2 {
    public static void main(String[] args) {
        // Check if system tray is supported
        if (!SystemTray.isSupported()) {
            System.out.println("System tray not supported");
            return;
        }

        // Get the system tray
        final SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu
        PopupMenu popup = new PopupMenu();

        // Create a menu item
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add the menu item to the popup menu
        popup.add(exitItem);

        // Create a tray icon
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo", popup);

        // Add the tray icon to the system tray
        tray.add(trayIcon);
    }
}
