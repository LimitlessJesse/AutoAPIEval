import javax.swing.table.JTableHeader;

public class JTableHeader_3 {
    public static void main(String[] args) {
        JTableHeader tableHeader = new JTableHeader();
        
        // Set reordering allowed to true
        tableHeader.setReorderingAllowed(true);
        
        // Check if reordering is allowed
        System.out.println("Reordering allowed: " + tableHeader.getReorderingAllowed());
    }
}
