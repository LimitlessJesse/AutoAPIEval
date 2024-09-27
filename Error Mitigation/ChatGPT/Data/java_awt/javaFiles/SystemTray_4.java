import java.awt.SystemTray;
import java.awt.TrayIcon;

public class SystemTray_4 {
    public static void main(String[] args) {
        SystemTray systemTray = SystemTray.getSystemTray();
        TrayIcon trayIcon = new TrayIcon(); // create a TrayIcon object
        systemTray.remove(trayIcon);
    }
}
