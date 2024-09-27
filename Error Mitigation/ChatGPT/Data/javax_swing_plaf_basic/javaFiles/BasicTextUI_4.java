import javax.swing.text.JTextComponent;
import javax.swing.plaf.basic.BasicTextUI;

public class BasicTextUI_4 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
        };
        BasicTextUI basicTextUI = new BasicTextUI();
        basicTextUI.damageRange(textComponent, 0, 5);
    }
}
