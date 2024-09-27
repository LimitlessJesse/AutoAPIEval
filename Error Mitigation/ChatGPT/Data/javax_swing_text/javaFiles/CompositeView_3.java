import javax.swing.text.CompositeView;
import javax.swing.text.View;

public class CompositeView_3 {
    public static void main(String[] args) {
        CompositeView compositeView = new CompositeView();
        View[] views = new View[2]; // create an array of views to add
        // replace child views starting at index 0, remove 1 existing view, and add 2 new views
        compositeView.replace(0, 1, views);
    }
}
