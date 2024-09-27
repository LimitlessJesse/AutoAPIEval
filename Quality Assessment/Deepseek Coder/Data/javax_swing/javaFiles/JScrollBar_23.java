import javax.swing.JScrollBar;

public class JScrollBar_23 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setUnitIncrement(10);
        int unitIncrement = scrollBar.getUnitIncrement();
        System.out.println("Unit Increment: " + unitIncrement);
    }
}
