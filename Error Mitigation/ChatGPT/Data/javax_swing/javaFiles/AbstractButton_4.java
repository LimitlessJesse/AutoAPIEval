import javax.swing.AbstractButton;

public class AbstractButton_4 {
    public static void main(String[] args) {
        AbstractButton button = new AbstractButton() {
            // Implementing setFocusPainted method
            public void setFocusPainted(boolean b) {
                // Setting the paintFocus property
                this.paintFocus = b;
            }
        };

        // Testing the setFocusPainted method
        button.setFocusPainted(true);
        System.out.println("Focus painted: " + button.paintFocus);
    }
}
