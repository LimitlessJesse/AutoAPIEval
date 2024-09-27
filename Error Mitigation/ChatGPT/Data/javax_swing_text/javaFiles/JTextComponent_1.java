import javax.swing.text.JTextComponent;

public class JTextComponent_1 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            // Implement JTextComponent methods here
        };
        
        // Set the text component as editable
        textComponent.setEditable(true);
        
        // Check if the text component is editable
        System.out.println("Is editable: " + textComponent.isEditable());
    }
}
