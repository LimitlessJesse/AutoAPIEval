import javax.print.attribute.standard.SheetCollate;

public class SheetCollate_4 {
    public static void main(String[] args) {
        SheetCollate sheetCollate = SheetCollate.COLLATED;
        String categoryName = sheetCollate.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
