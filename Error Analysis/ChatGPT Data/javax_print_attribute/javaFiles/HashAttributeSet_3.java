import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.PrinterResolution;
import javax.print.attribute.PrinterResolution;

public class HashAttributeSet_3 {
    public static void main(String[] args) {
        HashAttributeSet attributeSet = new HashAttributeSet();
        
        PrinterResolution resolution = new PrinterResolution(300, 600, PrinterResolution.DPI);
        attributeSet.add(resolution);
        
        boolean containsResolution = attributeSet.containsKey(PrinterResolution.class);
        System.out.println("Contains PrinterResolution: " + containsResolution);
        
        PrinterResolution resolution2 = new PrinterResolution(600, 1200, PrinterResolution.DPI);
        attributeSet.add(resolution2);
        
        boolean containsResolution2 = attributeSet.containsKey(PrinterResolution.class);
        System.out.println("Contains PrinterResolution: " + containsResolution2);
    }
}
