import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrayIcon_5 {
    public static void main(String[] args) {
        TrayIcon trayIcon = new TrayIcon(null);
        
        trayIcon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your action handling code here
                System.out.println("Tray icon clicked!");
            }
        });
    }
}
