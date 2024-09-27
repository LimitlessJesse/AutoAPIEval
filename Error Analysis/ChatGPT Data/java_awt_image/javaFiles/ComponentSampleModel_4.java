import java.awt.image.ComponentSampleModel;

public class ComponentSampleModel_4 {
    public static void main(String[] args) {
        // Creating an instance of ComponentSampleModel
        ComponentSampleModel sampleModel = new ComponentSampleModel(0, 0, 0, 0, 0, new int[]{}, new int[]{});

        // Using getOffset method to get the offset
        int x = 2;
        int y = 5;
        int offset = sampleModel.getOffset(x, y);

        System.out.println("Offset for x=" + x + ", y=" + y + " is: " + offset);
    }
}
