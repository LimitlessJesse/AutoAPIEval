import java.awt.*;

public class SystemTray_4 {
    public static void main(String[] args) {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.err.println("TrayIcon could not be added.");
        }

        // Remove the tray icon
        tray.remove(trayIcon);
    }
}
