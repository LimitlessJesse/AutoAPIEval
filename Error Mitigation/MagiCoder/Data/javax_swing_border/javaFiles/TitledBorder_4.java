import javax.swing.border.TitledBorder;

public class TitledBorder_4 {
    public static void main(String[] args) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Title");
        int titleJustification = titledBorder.getTitleJustification();
        System.out.println("Title Justification: " + titleJustification);
    }
}
