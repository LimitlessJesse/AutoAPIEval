import javax.swing.text.FieldView;

public class FieldView_3 {
    public static void main(String[] args) {
        FieldView fieldView = new FieldView(null, FieldView.X_AXIS);
        float preferredSpan = fieldView.getPreferredSpan(FieldView.X_AXIS);
        System.out.println("Preferred span along X_AXIS: " + preferredSpan);
    }
}
