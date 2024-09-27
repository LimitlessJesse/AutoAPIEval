import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

public class HashAttributeSet_4 {
    public static void main(String[] args) {
        HashAttributeSet hashAttributeSet = new HashAttributeSet();
        hashAttributeSet.add(MediaSizeName.ISO_A4);
        System.out.println("Size of HashAttributeSet: " + hashAttributeSet.size());
    }
}
