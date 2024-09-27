import javax.print.attribute.standard.SheetCollate;

public class SheetCollate_4 {
    public static void main(String[] args) {
        SheetCollate sheetCollate = SheetCollate.COLLATED;
        String name = sheetCollate.getName();
        
        System.out.println("Sheet collate attribute name: " + name);
    }
}
