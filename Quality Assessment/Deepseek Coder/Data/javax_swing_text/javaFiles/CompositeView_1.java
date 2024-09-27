import javax.swing.text.CompositeView;
import javax.swing.text.View;
import java.util.ArrayList;

public class CompositeView_1 {
    public static void main(String[] args) {
        CompositeView compositeView = new CompositeView();

        // Adding views to the composite view
        View view1 = new View();
        View view2 = new View();
        View view3 = new View();
        ArrayList<View> views = new ArrayList<>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        compositeView.add(views);

        // Getting the number of views in the composite view
        int viewCount = compositeView.getViewCount();
        System.out.println("Number of views in the composite view: " + viewCount);
    }
}
