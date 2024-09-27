import javax.swing.text.CompositeView;

public class CompositeView_1 {
    public static void main(String[] args) {
        CompositeView compositeView = new CompositeView();
        int viewCount = compositeView.getViewCount();
        System.out.println("Number of child views: " + viewCount);
    }
}
