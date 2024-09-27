import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_3 {
    public static void main(String[] args) {
        ComponentSampleModel sampleModel = new ComponentSampleModel();
        int pixelStride = sampleModel.getPixelStride();
        System.out.println("Pixel Stride: " + pixelStride);
    }
}
