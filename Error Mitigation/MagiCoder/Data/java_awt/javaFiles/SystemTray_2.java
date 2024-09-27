import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.AWTException;

public class SystemTray_2 {
    public static void main(String[] args) {
        SystemTray tray = SystemTray.getSystemTray();
        TrayIcon[] icons = tray.getTrayIcons();

        for (TrayIcon icon : icons) {
            System.out.println(icon);
        }
    }
}
