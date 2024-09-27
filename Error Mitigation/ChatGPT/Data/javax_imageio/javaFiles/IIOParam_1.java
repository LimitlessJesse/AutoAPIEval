import javax.imageio.IIOParam;
import java.awt.Rectangle;

public class IIOParam_1 {
    public static void main(String[] args) {
        IIOParam param = new IIOParam();
        Rectangle sourceRegion = new Rectangle(0, 0, 100, 100); // Example source region
        param.setSourceRegion(sourceRegion);
    }
}
