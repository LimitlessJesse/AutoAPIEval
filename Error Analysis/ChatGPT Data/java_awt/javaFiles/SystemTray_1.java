import java.awt.*;

public class SystemTray_1 {
    public static void main(String[] args) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.out.println("TrayIcon could not be added.");
            }
        } else {
            System.out.println("SystemTray is not supported.");
        }
    }
}
