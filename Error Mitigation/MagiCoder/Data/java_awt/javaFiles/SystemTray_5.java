import java.awt.*;
import java.awt.event.*;

public class SystemTray_5 {
    public static void main(String[] args) {
        try {
            // Get the system tray
            SystemTray tray = SystemTray.getSystemTray();

            // Create a popup menu
            PopupMenu popup = new PopupMenu();
            MenuItem item = new MenuItem("Item");
            popup.add(item);

            // Create a tray icon
            TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"), "Tray Demo", popup);
            trayIcon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Tray icon action performed");
                }
            });

            // Add the tray icon to the system tray
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
