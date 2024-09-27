import javax.swing.text.JTextComponent;
import javax.swing.plaf.basic.BasicTextUI;
import java.awt.Rectangle;

public class BasicTextUI_5 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public Rectangle modelToView(int pos) {
                // Implementation of modelToView method
                return new Rectangle();
            }
        };
        
        BasicTextUI basicTextUI = new BasicTextUI();
        Rectangle rect = basicTextUI.modelToView(textComponent, 0);
        System.out.println("Rectangle: " + rect);
    }
}
