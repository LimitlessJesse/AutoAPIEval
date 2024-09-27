import javax.swing.text.BadLocationException;
import javax.swing.text.IconView;
import javax.swing.text.Position;
import javax.swing.text.View;
import java.awt.*;

public class IconView_4 {
    public static void main(String[] args) throws BadLocationException {
        IconView iconView = new IconView(null);
        Shape shape = new Rectangle(10, 10, 50, 50); // Example shape
        int pos = 5; // Example position
        Position.Bias bias = Position.Bias.Forward; // Example bias

        View view = iconView.modelToView(pos, shape, bias);

        System.out.println("View bounds x: " + view.getBounds().x + ", y: " + view.getBounds().y + ", width: " + view.getBounds().width + ", height: " + view.getBounds().height);
    }
}
