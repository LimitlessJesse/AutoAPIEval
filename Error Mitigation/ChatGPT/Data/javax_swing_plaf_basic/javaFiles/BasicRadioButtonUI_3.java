import javax.swing.plaf.basic.BasicRadioButtonUI;
import javax.swing.Icon;

public class BasicRadioButtonUI_3 {
    public static void main(String[] args) {
        BasicRadioButtonUI radioButtonUI = new BasicRadioButtonUI();
        Icon defaultIcon = radioButtonUI.getDefaultIcon();
        System.out.println("Default Icon: " + defaultIcon);
    }
}
