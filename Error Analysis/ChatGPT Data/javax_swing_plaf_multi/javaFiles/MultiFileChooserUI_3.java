import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiFileChooserUI;

public class MultiFileChooserUI_3 {
    public static void main(String[] args) {
        MultiFileChooserUI multiFileChooserUI = new MultiFileChooserUI();
        ComponentUI[] uis = multiFileChooserUI.getUIs();
        
        for(ComponentUI ui : uis) {
            System.out.println(ui.getClass().getName());
        }
    }
}
