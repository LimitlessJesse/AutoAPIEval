import javax.swing.text.JTextComponent;

public class JTextComponent_5 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public int getCaretPosition() {
                return super.getCaretPosition();
            }
        };
        
        int caretPosition = textComponent.getCaretPosition();
        System.out.println("Caret Position: " + caretPosition);
    }
}
