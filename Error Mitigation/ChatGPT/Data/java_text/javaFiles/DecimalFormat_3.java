import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormat_3 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        Object obj = 1234.5678;
        AttributedCharacterIterator iterator = decimalFormat.formatToCharacterIterator(obj);
        
        // Iterate over the AttributedCharacterIterator to build the resulting String
        StringBuilder result = new StringBuilder();
        for (char c = iterator.first(); c != AttributedCharacterIterator.DONE; c = iterator.next()) {
            result.append(c);
        }
        
        System.out.println(result.toString());
    }
}
