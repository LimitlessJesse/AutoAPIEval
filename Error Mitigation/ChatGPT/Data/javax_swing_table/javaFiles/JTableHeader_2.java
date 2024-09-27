import javax.swing.table.JTableHeader;

public class JTableHeader_2 {
    public static void main(String[] args) {
        JTableHeader tableHeader = new JTableHeader();
        tableHeader.setReorderingAllowed(true);
        System.out.println("Column reordering allowed: " + tableHeader.getReorderingAllowed());
    }
}
