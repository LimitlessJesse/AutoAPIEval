import javax.swing.plaf.basic.BasicBorders;
import java.awt.Component;
import java.awt.Graphics;

public class BasicBorders_MenuBarBorder_4 {
    public static void main(String[] args) {
        BasicBorders.MenuBarBorder menuBarBorder = new BasicBorders.MenuBarBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        menuBarBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
