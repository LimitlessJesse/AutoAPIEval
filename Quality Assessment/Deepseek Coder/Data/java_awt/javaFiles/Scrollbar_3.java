import java.awt.Scrollbar;

public class Scrollbar_3 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValues(50, 10, 100, 10);
        int minValue = scrollbar.getMinimum();
        System.out.println("Minimum value of Scrollbar: " + minValue);
    }
}
