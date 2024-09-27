import javax.swing.JSlider;

public class JSlider_8 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        
        // Set the orientation of the slider
        slider.setOrientation(JSlider.HORIZONTAL);
        
        // Get the orientation of the slider
        int orientation = slider.getOrientation();
        
        // Check the orientation
        if (orientation == JSlider.HORIZONTAL) {
            System.out.println("The slider is horizontal.");
        } else if (orientation == JSlider.VERTICAL) {
            System.out.println("The slider is vertical.");
        } else {
            System.out.println("Invalid orientation.");
        }
    }
}
