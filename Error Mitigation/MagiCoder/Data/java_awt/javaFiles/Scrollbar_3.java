import java.awt.Scrollbar;

public class Scrollbar_3 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValues(0, 10, 0, 100);
        int maximum = scrollbar.getMaximum();
        System.out.println("Maximum value of the scrollbar: " + maximum);
    }
}
