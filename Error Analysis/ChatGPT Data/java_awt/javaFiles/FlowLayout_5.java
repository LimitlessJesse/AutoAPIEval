import java.awt.FlowLayout;

public class FlowLayout_5 {
    public static void main(String[] args) {
        FlowLayout layout = new FlowLayout();
        int hGap = layout.getHgap();
        System.out.println("Horizontal gap: " + hGap);
    }
}
