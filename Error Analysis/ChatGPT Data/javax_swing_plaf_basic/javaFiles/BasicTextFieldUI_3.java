import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.Element;
import javax.swing.text.View;

public class BasicTextFieldUI_3 {
    public static void main(String[] args) {
        BasicTextFieldUI ui = new BasicTextFieldUI();
        Element elem = null; // initialize Element object
        View view = ui.create(elem);
    }
}
