import java.awt.Scrollbar;

public class Scrollbar_13 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int unitIncrement = scrollbar.getUnitIncrement();
        System.out.println("Unit Increment: " + unitIncrement);
    }
}
