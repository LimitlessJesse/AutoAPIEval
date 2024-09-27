import javax.swing.text.ComponentView;

public class ComponentView_3 {
    public static void main(String[] args) {
        ComponentView componentView = new ComponentView(null);
        float preferredSpan = componentView.getPreferredSpan(ComponentView.X_AXIS);
        System.out.println("Preferred span along X_AXIS: " + preferredSpan);
    }
}
