import java.awt.Scrollbar;

public class Scrollbar_4 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int minValue = scrollbar.getMinimum();
        System.out.println("Minimum value of the scrollbar: " + minValue);
    }
}
