import java.awt.AlphaComposite;

public class AlphaComposite_2 {
    public static void main(String[] args) {
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
        AlphaComposite derivedComposite = alphaComposite.derive(AlphaComposite.DST_OVER);
        System.out.println("Derived composite rule: " + derivedComposite);
    }
}
