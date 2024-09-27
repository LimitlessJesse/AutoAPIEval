import java.awt.Scrollbar;

public class Scrollbar_1 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValues(50, 10, 0, 100);
        System.out.println("Value: " + scrollbar.getValue());
        System.out.println("Visible Amount: " + scrollbar.getVisibleAmount());
        System.out.println("Minimum: " + scrollbar.getMinimum());
        System.out.println("Maximum: " + scrollbar.getMaximum());
    }
}
