import java.awt.Scrollbar;

public class Scrollbar_3 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int visibleAmount = scrollbar.getVisibleAmount();
        System.out.println("Visible amount: " + visibleAmount);
    }
}
