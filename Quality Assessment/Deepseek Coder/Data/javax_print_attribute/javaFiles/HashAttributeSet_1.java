import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

public class HashAttributeSet_1 {
    public static void main(String[] args) {
        HashAttributeSet attributeSet = new HashAttributeSet();
        boolean result = attributeSet.add(MediaSizeName.ISO_A4);
        System.out.println(result);
    }
}
