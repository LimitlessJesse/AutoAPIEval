import javax.swing.JToggleButton;
import javax.swing.JButton;

public class JToggleButton_ToggleButtonModel_5 {
    public static void main(String[] args) {
        JToggleButton button = new JToggleButton("Toggle");
        button.setModel(new JToggleButton.ToggleButtonModel() {
            @Override
            public void setPressed(boolean b) {
                super.setPressed(b);
                System.out.println("Button is pressed: " + b);
            }
        });
        button.doClick();
    }
}
