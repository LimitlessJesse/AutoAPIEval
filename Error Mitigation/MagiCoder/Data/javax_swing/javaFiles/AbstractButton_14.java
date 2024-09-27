import javax.swing.AbstractButton;
import java.awt.Insets;

public class AbstractButton_14 {
    public static void main(String[] args) {
        AbstractButton button = new AbstractButton() {
            @Override
            public Insets getMargin() {
                // Implement the logic here
                return new Insets(10, 10, 10, 10);
            }
        };

        Insets margin = button.getMargin();
        System.out.println("Top: " + margin.top + ", Left: " + margin.left + ", Bottom: " + margin.bottom + ", Right: " + margin.right);
    }
}
