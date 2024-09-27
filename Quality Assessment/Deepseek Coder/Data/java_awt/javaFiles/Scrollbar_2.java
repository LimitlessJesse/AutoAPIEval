import java.awt.Scrollbar;

public class Scrollbar_2 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValue(50);
        System.out.println("The value of the scrollbar is: " + scrollbar.getValue());
    }
}
