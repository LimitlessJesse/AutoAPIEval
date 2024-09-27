import java.awt.*;

public class TrayIcon_4 {
    public static void main(String[] args) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");
            trayIcon.setToolTip("This is a tooltip message");
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.out.println("TrayIcon could not be added.");
            }
        } else {
            System.out.println("System tray is not supported.");
        }
    }
}
