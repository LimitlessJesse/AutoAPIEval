import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_4 {
    public static void main(String[] args) {
        ComponentSampleModel sampleModel = new ComponentSampleModel();
        int scanlineStride = sampleModel.getScanlineStride();
        System.out.println("Scanline Stride: " + scanlineStride);
    }
}
