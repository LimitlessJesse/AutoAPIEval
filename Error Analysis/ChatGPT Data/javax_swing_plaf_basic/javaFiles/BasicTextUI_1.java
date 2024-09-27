import javax.swing.plaf.basic.BasicTextUI;
import javax.swing.text.Element;

public class BasicTextUI_1 {
    public static void main(String[] args) {
        BasicTextUI basicTextUI = new BasicTextUI();
        Element element = ...; // create an Element object
        javax.swing.text.View view = basicTextUI.create(element);
        System.out.println(view);
    }
}
