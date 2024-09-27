import java.awt.AlphaComposite;

public class AlphaComposite_1 {
    public static void main(String[] args) {
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        AlphaComposite derivedComposite = alphaComposite.derive(0.8f);
        System.out.println("Original Alpha: " + alphaComposite.getAlpha());
        System.out.println("Derived Alpha: " + derivedComposite.getAlpha());
    }
}
