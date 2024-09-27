import java.awt.Scrollbar;

public class Scrollbar_12 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setUnitIncrement(10);
        System.out.println("Unit Increment: " + scrollbar.getUnitIncrement());
    }
}
