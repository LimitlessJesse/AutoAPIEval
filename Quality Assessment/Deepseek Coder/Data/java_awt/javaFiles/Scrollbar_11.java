import java.awt.Scrollbar;

public class Scrollbar_11 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setValues(50, 100, 1);
        int visibleAmount = scrollbar.getVisibleAmount();
        System.out.println("Visible Amount: " + visibleAmount);
    }
}
