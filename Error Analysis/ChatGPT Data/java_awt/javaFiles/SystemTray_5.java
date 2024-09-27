import java.awt.Dimension;
import java.awt.SystemTray;

public class SystemTray_5 {
    public static void main(String[] args) {
        SystemTray systemTray = SystemTray.getSystemTray();
        Dimension trayIconSize = systemTray.getTrayIconSize();
        System.out.println("Tray Icon Size: " + trayIconSize);
    }
}
