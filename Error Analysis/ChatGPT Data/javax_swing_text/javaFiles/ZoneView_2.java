import javax.swing.text.ZoneView;

public class ZoneView_2 {
    public static void main(String[] args) {
        ZoneView zoneView = new ZoneView(null);
        int index = zoneView.getViewIndexAtPosition(10);
        System.out.println("Index at position 10: " + index);
    }
}
