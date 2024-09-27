import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class DisplayMode_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (GraphicsDevice gd : gs) {
            DisplayMode[] dms = gd.getDisplayModes();
            for (DisplayMode dm : dms) {
                System.out.println("Refresh Rate: " + dm.getRefreshRate());
            }
        }
    }
}
