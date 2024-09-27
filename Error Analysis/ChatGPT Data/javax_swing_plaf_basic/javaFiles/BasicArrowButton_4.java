import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.Graphics;

public class BasicArrowButton_4 {
    public static void main(String[] args) {
        BasicArrowButton button = new BasicArrowButton(BasicArrowButton.NORTH);
        button.paintTriangle(button.getGraphics(), 50, 50, 20, BasicArrowButton.NORTH, true);
    }
}
