import java.awt.AlphaComposite;

public class AlphaComposite_5 {
    public static void main(String[] args) {
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
        int rule = alphaComposite.getRule();
        System.out.println("Compositing rule: " + rule);
    }
}
