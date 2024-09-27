import java.awt.ComponentOrientation;

public class ComponentOrientation_5 {
    public static void main(String[] args) {
        ComponentOrientation orientation = ComponentOrientation.LEFT_TO_RIGHT;
        boolean isLeftToRight = orientation.isLeftToRight();
        System.out.println("Is left to right: " + isLeftToRight);
    }
}
