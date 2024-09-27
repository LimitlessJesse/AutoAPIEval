import javax.swing.plaf.basic.BasicArrowButton;

public class BasicArrowButton_5 {
    public static void main(String[] args) {
        // Create a BasicArrowButton object
        BasicArrowButton button = new BasicArrowButton(BasicArrowButton.NORTH);

        // Create a Graphics object (usually obtained from a component)
        Graphics g = null;

        // Call the paint method on the BasicArrowButton object
        button.paint(g);
    }
}
