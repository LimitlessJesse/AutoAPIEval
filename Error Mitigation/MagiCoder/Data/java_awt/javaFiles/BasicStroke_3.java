import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class BasicStroke_3 {
    public static void main(String[] args) {
        // Create a BasicStroke object with a line width of 5
        Stroke stroke = new BasicStroke(5);

        // Get the line width of the BasicStroke object
        float lineWidth = ((BasicStroke) stroke).getLineWidth();

        // Print the line width
        System.out.println("Line width: " + lineWidth);
    }
}
