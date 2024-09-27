import javax.swing.border.TitledBorder;

public class TitledBorder_3 {
    public static void main(String[] args) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Title");
        String title = titledBorder.getTitle();
        System.out.println("Title: " + title);
    }
}
