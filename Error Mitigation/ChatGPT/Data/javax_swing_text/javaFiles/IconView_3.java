import javax.swing.text.IconView;

public class IconView_3 {
    public static void main(String[] args) {
        IconView iconView = new IconView(null);
        float preferredSpan = iconView.getPreferredSpan(IconView.X_AXIS);
        System.out.println("Preferred span along X_AXIS: " + preferredSpan);
    }
}
