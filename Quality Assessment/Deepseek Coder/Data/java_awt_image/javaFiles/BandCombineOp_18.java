import java.awt.image.BandCombineOp;
import java.awt.RenderingHints;

public class BandCombineOp_18 {
    public static void main(String[] args) {
        BandCombineOp bandCombineOp = new BandCombineOp();
        RenderingHints renderingHints = bandCombineOp.getRenderingHints();
        System.out.println(renderingHints);
    }
}
