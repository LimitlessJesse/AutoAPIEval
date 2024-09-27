import javax.swing.text.JTextComponent;

public class JTextComponent_3 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public String getText() {
                return super.getText();
            }
        };
        
        textComponent.setText("Hello World");
        System.out.println(textComponent.getText());
    }
}
