import java.awt.PageAttributes;
import java.awt.PageAttributes.PrintQualityType;

public class PageAttributes_PrintQualityType_4 {
    public static void main(String[] args) {
        PageAttributes pageAttributes = new PageAttributes();
        PrintQualityType printQualityType = pageAttributes.getPrintQuality();
        int hashCode = printQualityType.hashCode();
        System.out.println("HashCode of PrintQualityType: " + hashCode);
    }
}
