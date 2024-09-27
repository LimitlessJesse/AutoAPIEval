import javax.swing.plaf.basic.BasicArrowButton;

public class BasicArrowButton_2 {
    public static void main(String[] args) {
        // Create a BasicArrowButton
        BasicArrowButton arrowButton = new BasicArrowButton(BasicArrowButton.EAST);
        
        // Set the direction to WEST
        arrowButton.setDirection(BasicArrowButton.WEST);
        
        // Print the direction
        System.out.println("Arrow direction: " + arrowButton.getDirection());
    }
}
