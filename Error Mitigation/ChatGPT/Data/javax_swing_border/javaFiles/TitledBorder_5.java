import javax.swing.border.TitledBorder;

public class TitledBorder_5 {
    public static void main(String[] args) {
        TitledBorder titledBorder = new TitledBorder("Title");
        int titleJustification = titledBorder.getTitleJustification();
        System.out.println("Title Justification: " + titleJustification);
    }
}
