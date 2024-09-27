import javax.swing.text.SimpleAttributeSet;

public class SimpleAttributeSet_2 {
    public static void main(String[] args) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        attributeSet.addAttribute("font-size", 12);
        attributeSet.removeAttribute("font-size");
    }
}
