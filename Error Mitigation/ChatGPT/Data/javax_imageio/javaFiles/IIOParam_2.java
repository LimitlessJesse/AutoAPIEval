import javax.imageio.IIOParam;
import java.awt.Rectangle;

public class IIOParam_2 {
    public static void main(String[] args) {
        IIOParam param = new IIOParam();
        Rectangle sourceRegion = param.getSourceRegion();
        System.out.println("Source Region: " + sourceRegion);
    }
}
