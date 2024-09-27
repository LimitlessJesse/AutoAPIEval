import javax.swing.JScrollBar;

public class JScrollBar_5 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setUnitIncrement(10);
        int unitIncrement = scrollBar.getUnitIncrement();
        System.out.println("Unit Increment: " + unitIncrement);
    }
}
