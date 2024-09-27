import javax.swing.JComponent;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.multi.MultiSpinnerUI;

public class MultiSpinnerUI_3 {
    public static void main(String[] args) {
        MultiSpinnerUI spinnerUI = new MultiSpinnerUI();
        JComponent component = new JComponent() {};
        int width = spinnerUI.getPreferredSize(component).width;
        int height = spinnerUI.getPreferredSize(component).height;
        System.out.println("Preferred Size - Width: " + width + ", Height: " + height);
    }
}
