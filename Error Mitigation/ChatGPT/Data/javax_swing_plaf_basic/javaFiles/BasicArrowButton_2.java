import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.SwingConstants;

public class BasicArrowButton_2 {
    public static void main(String[] args) {
        BasicArrowButton arrowButton = new BasicArrowButton(SwingConstants.NORTH);
        arrowButton.setDirection(SwingConstants.EAST);
    }
}
