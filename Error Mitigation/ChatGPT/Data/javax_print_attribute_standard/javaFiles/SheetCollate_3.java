import javax.print.attribute.standard.SheetCollate;

public class SheetCollate_3 {
    public static void main(String[] args) {
        SheetCollate sheetCollate = SheetCollate.COLLATED;
        Class<? extends Attribute> category = sheetCollate.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
