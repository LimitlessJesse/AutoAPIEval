import javax.swing.border.TitledBorder;

public class TitledBorder_1 {
    public static void main(String[] args) {
        TitledBorder titledBorder = new TitledBorder("Title");
        String title = titledBorder.getTitle();
        System.out.println("Title: " + title);
    }
}
