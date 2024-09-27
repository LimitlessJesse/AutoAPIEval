import java.awt.image.ComponentColorModel;
import java.awt.image.WritableRaster;

public class ComponentColorModel_5 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel(null, null, false, false, ComponentColorModel.OPAQUE, DataBuffer.TYPE_BYTE);
        WritableRaster raster = colorModel.createCompatibleWritableRaster(100, 100);
        System.out.println(raster.getWidth());
        System.out.println(raster.getHeight());
    }
}
