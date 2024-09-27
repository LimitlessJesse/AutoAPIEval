import java.awt.Dimension;
import java.awt.Panel;

public class Dimension_3 {
    public static void main(String[] args) {
        Panel panel = new Panel();
        Dimension dimension = new Dimension(500, 500);
        panel.setPreferredSize(dimension);
        System.out.println("Preferred Width: " + panel.getPreferredSize().width);
        System.out.println("Preferred Height: " + panel.getPreferredSize().height);
    }
}
