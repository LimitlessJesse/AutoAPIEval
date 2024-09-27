import java.awt.Scrollbar;

public class Scrollbar_4 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValues(50, 10, 100, 10);
        int maximum = scrollbar.getMaximum();
        System.out.println("Maximum value of the scrollbar is: " + maximum);
    }
}
