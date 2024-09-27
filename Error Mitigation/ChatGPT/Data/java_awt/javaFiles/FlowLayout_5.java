import java.awt.FlowLayout;

public class FlowLayout_5 {
    public static void main(String[] args) {
        FlowLayout flowLayout = new FlowLayout();
        int hgap = flowLayout.getHgap();
        System.out.println("Horizontal gap: " + hgap);
    }
}
