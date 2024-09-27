import javax.swing.text.GlyphView;
import javax.swing.text.Position;

public class GlyphView_4 {
    public static void main(String[] args) {
        GlyphView glyphView = new GlyphView(null); // create a new GlyphView object
        
        float x = 10.0f;
        float y = 20.0f;
        Shape a = new Rectangle2D.Float(0, 0, 100, 100); // create a new Shape object
        Position.Bias[] biasReturn = new Position.Bias[1];
        
        int location = glyphView.viewToModel(x, y, a, biasReturn); // call the viewToModel method
        
        System.out.println("Location within the model: " + location);
        System.out.println("Bias: " + biasReturn[0]);
    }
}
