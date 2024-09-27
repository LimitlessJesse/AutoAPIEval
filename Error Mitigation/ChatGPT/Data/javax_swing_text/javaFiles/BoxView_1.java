import javax.swing.text.BoxView;

public class BoxView_1 {
    public static void main(String[] args) {
        BoxView boxView = new BoxView(null, View.Y_AXIS);
        int axis = boxView.getAxis();
        System.out.println("Axis: " + axis);
    }
}
