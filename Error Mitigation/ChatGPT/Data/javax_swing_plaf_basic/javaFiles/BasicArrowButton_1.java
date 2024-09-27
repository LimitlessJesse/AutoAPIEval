import javax.swing.plaf.basic.BasicArrowButton;

public class BasicArrowButton_1 {
    public static void main(String[] args) {
        BasicArrowButton button = new BasicArrowButton(BasicArrowButton.NORTH);
        int direction = button.getDirection();
        System.out.println("Arrow direction: " + direction);
    }
}
