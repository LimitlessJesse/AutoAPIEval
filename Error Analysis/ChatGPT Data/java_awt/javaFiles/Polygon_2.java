import java.awt.Polygon;

public class Polygon_2 {
    public static void main(String[] args) {
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {150, 250, 350};
        Polygon polygon = new Polygon(xPoints, yPoints, 3);

        int x = 150;
        int y = 250;

        boolean containsPoint = polygon.contains(x, y);
        System.out.println("Does the polygon contain point (" + x + "," + y + ")? " + containsPoint);
    }
}
