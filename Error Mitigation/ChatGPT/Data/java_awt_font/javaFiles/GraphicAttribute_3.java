import java.awt.font.GraphicAttribute;

public class GraphicAttribute_3 {
    public static void main(String[] args) {
        GraphicAttribute graphicAttribute = new GraphicAttribute() {
            @Override
            public float getAdvance() {
                return 10.5f;
            }
        };
        
        System.out.println("Advance of GraphicAttribute: " + graphicAttribute.getAdvance());
    }
}
