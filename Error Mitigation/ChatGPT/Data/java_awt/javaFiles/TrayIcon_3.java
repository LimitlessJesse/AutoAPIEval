import java.awt.*;

public class TrayIcon_3 {
    public static void main(String[] args) {
        // Create a TrayIcon
        TrayIcon trayIcon = new TrayIcon(new ImageIcon("icon.png").getImage());

        // Create a PopupMenu
        PopupMenu popupMenu = new PopupMenu();
        MenuItem menuItem = new MenuItem("Exit");
        popupMenu.add(menuItem);

        // Set the PopupMenu for the TrayIcon
        trayIcon.setPopupMenu(popupMenu);
    }
}
