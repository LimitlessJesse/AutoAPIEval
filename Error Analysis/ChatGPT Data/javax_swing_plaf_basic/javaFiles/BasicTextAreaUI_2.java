import javax.swing.plaf.basic.BasicTextAreaUI;

public class BasicTextAreaUI_2 {
    public static void main(String[] args) {
        BasicTextAreaUI ui = new BasicTextAreaUI();
        String prefix = ui.getPropertyPrefix();
        System.out.println("Property Prefix: " + prefix);
    }
}
