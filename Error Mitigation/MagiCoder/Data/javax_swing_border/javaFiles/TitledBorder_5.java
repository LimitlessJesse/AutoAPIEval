import javax.swing.border.TitledBorder;

public class TitledBorder_5 {
    public static void main(String[] args) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Title");
        int titlePosition = titledBorder.getTitlePosition();
        System.out.println("Title Position: " + titlePosition);
    }
}
