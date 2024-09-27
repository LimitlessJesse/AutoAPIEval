import javax.swing.AbstractButton;

public class AbstractButton_3 {
    public static void main(String[] args) {
        AbstractButton button = new AbstractButton() {
            // Implementing setBorderPainted method
            public void setBorderPainted(boolean b) {
                if (b && getBorder() != null) {
                    // Paint the border
                    System.out.println("Border is painted");
                } else {
                    // Do not paint the border
                    System.out.println("Border is not painted");
                }
            }
        };

        // Testing the setBorderPainted method
        button.setBorderPainted(true);
    }
}
