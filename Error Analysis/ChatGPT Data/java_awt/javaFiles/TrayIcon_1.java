import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

public class TrayIcon_1 {
    public static void main(String[] args) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            TrayIcon trayIcon = new TrayIcon(toolkit.getImage("icon.png"));
            
            trayIcon.displayMessage("Title", "Hello World!", TrayIcon.MessageType.INFO);
        } else {
            System.out.println("SystemTray is not supported");
        }
    }
}
