import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;

public class SimpleAttributeSet_4 {
    public static void main(String[] args) {
        MutableAttributeSet mutableAttributeSet = new SimpleAttributeSet();
        AttributeSet attributes = new SimpleAttributeSet();
        
        // Adding attributes to the mutableAttributeSet
        mutableAttributeSet.addAttributes(attributes);
    }
}
