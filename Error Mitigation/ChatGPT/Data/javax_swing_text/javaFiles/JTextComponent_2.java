import javax.swing.text.JTextComponent;

public class JTextComponent_2 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            // Implementing the setText method
            public void setText(String t) {
                if (t == null || t.isEmpty()) {
                    // Delete the old text
                    // Implement the deletion logic here
                } else {
                    // Set the new text
                    // Implement setting the new text logic here
                }
            }
        };
        
        // Example usage of setText method
        textComponent.setText("This is a sample text");
        System.out.println(textComponent.getText()); // Output: This is a sample text
    }
}
