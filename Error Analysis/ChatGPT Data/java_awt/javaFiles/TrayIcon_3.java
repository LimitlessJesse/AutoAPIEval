import java.awt.*;

public class TrayIcon_3 {
    public static void main(String[] args) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            TrayIcon trayIcon = new TrayIcon(new ImageIcon("icon.png").getImage(), "Tray Icon");
            PopupMenu popup = trayIcon.getPopupMenu();
            // Add menu items to the popup menu
            MenuItem item1 = new MenuItem("Item 1");
            MenuItem item2 = new MenuItem("Item 2");
            popup.add(item1);
            popup.add(item2);

            tray.add(trayIcon);
        } else {
            System.out.println("System tray is not supported");
        }
    }
}
