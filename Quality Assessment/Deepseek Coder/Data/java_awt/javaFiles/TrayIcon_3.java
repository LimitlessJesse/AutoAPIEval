import java.awt.*;
import java.awt.event.*;

public class TrayIcon_3 {
    public static void main(String[] args) {
        // Create a system tray icon
        PopupMenu popup = new PopupMenu();
        MenuItem item = new MenuItem("Exit");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        popup.add(item);

        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().createImage("icon.png"), "Tray Demo", popup);
        trayIcon.setImageAutoSize(true);

        // Add the tray icon
        SystemTray tray = SystemTray.getSystemTray();
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.err.println("TrayIcon could not be added.");
            System.exit(1);
        }

        // Set the tooltip
        trayIcon.setToolTip("This is a tooltip");
    }
}
