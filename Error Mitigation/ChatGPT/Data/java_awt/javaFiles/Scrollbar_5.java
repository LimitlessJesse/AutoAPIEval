import java.awt.Scrollbar;

public class Scrollbar_5 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int maximumValue = scrollbar.getMaximum();
        System.out.println("Maximum value of the scroll bar: " + maximumValue);
    }
}
