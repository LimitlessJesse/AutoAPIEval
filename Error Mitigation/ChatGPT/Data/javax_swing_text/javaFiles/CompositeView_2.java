import javax.swing.text.CompositeView;
import javax.swing.text.View;

public class CompositeView_2 {
    public static void main(String[] args) {
        CompositeView compositeView = new CompositeView(null);
        View view = compositeView.getView(0);
        System.out.println(view);
    }
}
