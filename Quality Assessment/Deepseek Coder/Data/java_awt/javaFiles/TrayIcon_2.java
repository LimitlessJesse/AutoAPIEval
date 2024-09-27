import java.awt.*;
import java.awt.TrayIcon.MessageType;
import javax.swing.*;

public class TrayIcon_2 {
    public static void main(String[] args) {
        // Check the system tray support
        if (!SystemTray.isSupported()) {
            System.out.println("No system tray support");
            return;
        }

        // Create a popup menu
        PopupMenu popup = new PopupMenu();
        MenuItem item = new MenuItem("Exit");
        item.addActionListener(e -> System.exit(0));
        popup.add(item);

        // Create a system tray icon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().createImage("icon.png"), "Tray Demo", popup);
        trayIcon.setImageAutoSize(true);

        // Add the icon to the system tray
        SystemTray tray = SystemTray.getSystemTray();
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("Could not add icon to system tray");
            return;
        }

        // Show a message in the system tray
        trayIcon.displayMessage("Hello", "This is a message", MessageType.INFO);

        // Set a new image
        trayIcon.setImage(Toolkit.getDefaultToolkit().createImage("new_icon.png"));
    }
}
