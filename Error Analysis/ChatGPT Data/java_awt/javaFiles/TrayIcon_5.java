import java.awt.*;

public class TrayIcon_5 {
    public static void main(String[] args) {
        if (SystemTray.isSupported()) {
            SystemTray systemTray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");

            trayIcon.setToolTip("This is a tooltip message");

            try {
                systemTray.add(trayIcon);
            } catch (AWTException e) {
                System.out.println("TrayIcon could not be added.");
            }
        } else {
            System.out.println("SystemTray is not supported.");
        }
    }
}
