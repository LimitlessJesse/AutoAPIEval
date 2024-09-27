import javax.swing.text.JTextComponent;

public class JTextComponent_5 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public boolean isEditable() {
                return true;
            }
        };

        boolean isEditable = textComponent.isEditable();
        System.out.println("Is Editable: " + isEditable);
    }
}
