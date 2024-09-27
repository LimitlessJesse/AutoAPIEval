import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_5 {
    public static void main(String[] args) {
        ComponentSampleModel sampleModel = new ComponentSampleModel();
        int[] bandOffsets = sampleModel.getBandOffsets();
        for (int offset : bandOffsets) {
            System.out.println("Band Offset: " + offset);
        }
    }
}
