import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;

public class SimpleAttributeSet_3 {
    public static void main(String[] args) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        AttributeSet parent = new SimpleAttributeSet();
        
        ((MutableAttributeSet) attributeSet).setResolveParent(parent);
    }
}
