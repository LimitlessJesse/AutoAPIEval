import java.awt.*;

public class GraphicsDevice_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        DisplayMode dm = gd.getDisplayMode();

        System.out.println("Display mode: " + dm.getWidth() + " x " + dm.getHeight() + " x " + dm.getBitDepth());
    }
}
