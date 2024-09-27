import java.awt.TrayIcon;

public class TrayIcon_1 {
    public static void main(String[] args) {
        TrayIcon trayIcon = new TrayIcon(null, "Tray Icon");
        trayIcon.displayMessage("Notification", "Hello World", TrayIcon.MessageType.INFO);
    }
}
