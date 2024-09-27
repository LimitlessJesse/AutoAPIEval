import javax.swing.border.TitledBorder;

public class TitledBorder_3 {
    public static void main(String[] args) {
        TitledBorder titledBorder = new TitledBorder("Title");
        int titlePosition = titledBorder.getTitlePosition();
        System.out.println("Title position: " + titlePosition);
    }
}
