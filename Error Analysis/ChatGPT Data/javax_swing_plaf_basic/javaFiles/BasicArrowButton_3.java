import javax.swing.plaf.basic.BasicArrowButton;

public class BasicArrowButton_3 {
    public static void main(String[] args) {
        BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.NORTH);
        System.out.println(basicArrowButton.getPreferredSize());
    }
}
