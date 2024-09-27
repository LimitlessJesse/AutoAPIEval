import java.awt.ComponentOrientation;

public class ComponentOrientation_2 {
    public static void main(String[] args) {
        ComponentOrientation orientation = ComponentOrientation.getOrientation(Locale.getDefault());
        boolean isLeftToRight = orientation.isLeftToRight();
        System.out.println("Is Left to Right: " + isLeftToRight);
    }
}
