import javax.swing.border.TitledBorder;

public class TitledBorder_3 {
    public static void main(String[] args) {
        TitledBorder title = new TitledBorder("Title");
        int position = title.getTitlePosition();
        System.out.println("Title position: " + position);
    }
}
