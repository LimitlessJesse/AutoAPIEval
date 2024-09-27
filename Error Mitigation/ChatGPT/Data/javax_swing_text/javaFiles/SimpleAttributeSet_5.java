import javax.swing.text.SimpleAttributeSet;
import java.util.Enumeration;

public class SimpleAttributeSet_5 {
    public static void main(String[] args) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        attributeSet.addAttribute("FontFamily", "Arial");
        attributeSet.addAttribute("FontSize", 12);
        
        Enumeration<?> namesToRemove = attributeSet.getAttributeNames();
        while (namesToRemove.hasMoreElements()) {
            String name = (String) namesToRemove.nextElement();
            if (name.equals("FontFamily") || name.equals("FontSize")) {
                attributeSet.removeAttribute(name);
            }
        }
        
        System.out.println("Attributes after removal: " + attributeSet);
    }
}
