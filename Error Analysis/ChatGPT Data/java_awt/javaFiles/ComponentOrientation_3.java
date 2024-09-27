import java.awt.ComponentOrientation;

public class ComponentOrientation_3 {
    public static void main(String[] args) {
        ComponentOrientation orientation = ComponentOrientation.LEFT_TO_RIGHT;
        boolean isHorizontal = orientation.isHorizontal();
        System.out.println("Is horizontal orientation: " + isHorizontal);
    }
}
