import java.awt.Scrollbar;

public class Scrollbar_2 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int value = scrollbar.getValue();
        System.out.println("Current value of the scroll bar: " + value);
    }
}
