import java.awt.SystemTray;
import java.awt.TrayIcon;

public class SystemTray_2 {
    public static void main(String[] args) {
        SystemTray tray = SystemTray.getSystemTray();
        TrayIcon trayIcon = new TrayIcon();
        tray.remove(trayIcon);
        System.out.println("TrayIcon removed successfully");
    }
}
