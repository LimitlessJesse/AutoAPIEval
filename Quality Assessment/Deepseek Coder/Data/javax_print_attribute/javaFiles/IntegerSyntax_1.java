import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.standard.MediaSizeName;

public class IntegerSyntax_1 {
    public static void main(String[] args) {
        MediaSizeName mediaSizeName = MediaSizeName.ISO_A4;
        IntegerSyntax integerSyntax = mediaSizeName.getSize();
        int value = integerSyntax.getValue();
        System.out.println("Value: " + value);
    }
}
