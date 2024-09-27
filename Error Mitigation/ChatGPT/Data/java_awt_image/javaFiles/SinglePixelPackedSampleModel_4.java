import java.awt.image.DataBuffer;
import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_4 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel sppsm1, sppsm2;
        DataBuffer db1, db2;
        int x = 0; // X coordinate of the pixel location
        int y = 0; // Y coordinate of the pixel location
        Object obj = new int[1]; // A primitive array containing pixel data
        sppsm2.setDataElements(x, y, sppsm1.getDataElements(x, y, null, db1), db2);
    }
}
