import javax.swing.AbstractButton;

public class AbstractButton_5 {
    public static void main(String[] args) {
        AbstractButton button = new AbstractButton() {
            // Implementing setRolloverEnabled method
            public void setRolloverEnabled(boolean b) {
                // Setting the rolloverEnabled property
                if (b) {
                    System.out.println("Rollover effects enabled");
                } else {
                    System.out.println("Rollover effects disabled");
                }
            }
        };

        // Calling the setRolloverEnabled method
        button.setRolloverEnabled(true);
    }
}
