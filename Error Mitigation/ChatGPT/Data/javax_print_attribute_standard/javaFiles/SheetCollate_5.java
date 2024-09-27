import javax.print.attribute.standard.SheetCollate;

public class SheetCollate_5 {
    public static void main(String[] args) {
        SheetCollate sheetCollate = SheetCollate.SEQUENTIAL;
        EnumSyntax[] enumValueTable = sheetCollate.getEnumValueTable();
        
        for(EnumSyntax enumSyntax : enumValueTable) {
            System.out.println(enumSyntax);
        }
    }
}
