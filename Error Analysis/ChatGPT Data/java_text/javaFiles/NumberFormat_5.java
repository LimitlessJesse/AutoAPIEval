import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_5 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        
        // Before setting grouping used
        System.out.println("Grouping used before setting: " + numberFormat.isGroupingUsed());
        
        // Set grouping used to false
        numberFormat.setGroupingUsed(false);
        System.out.println("Grouping used after setting to false: " + numberFormat.isGroupingUsed());
        
        // Set grouping used to true
        numberFormat.setGroupingUsed(true);
        System.out.println("Grouping used after setting to true: " + numberFormat.isGroupingUsed());
    }
}
