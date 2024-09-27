import javax.print.attribute.HashAttributeSet;

public class HashAttributeSet_5 {
    public static void main(String[] args) {
        HashAttributeSet attributeSet = new HashAttributeSet();
        attributeSet.add(new HashAttribute());
        
        int size = attributeSet.size();
        System.out.println("Size of HashAttributeSet: " + size);
    }
}
