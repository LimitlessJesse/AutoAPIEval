import java.awt.image.ColorConvertOp;
import java.awt.image.RenderingHints;

public class ColorConvertOp_3 {
    public static void main(String[] args) {
        ColorConvertOp colorConvertOp = new ColorConvertOp(RenderingHints.VALUE_COLOR_SPACE_YUV, null);
        RenderingHints renderingHints = colorConvertOp.getRenderingHints();
        System.out.println(renderingHints);
    }
}
