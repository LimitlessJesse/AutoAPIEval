import java.awt.*;
import java.awt.event.*;

public class TrayIcon_2 {
    public static void main(String[] args) {
        // Check if system supports SystemTray
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }

        // Get the SystemTray instance
        final SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu
        PopupMenu popup = new PopupMenu();
        MenuItem item = new MenuItem("Exit");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        popup.add(item);

        // Create a TrayIcon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"), "Tray Demo", popup);
        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tray icon clicked");
            }
        });

        // Add TrayIcon to SystemTray
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
        }

        // Display a message
        trayIcon.displayMessage("Title", "Message", TrayIcon.MessageType.INFO);
    }
}
