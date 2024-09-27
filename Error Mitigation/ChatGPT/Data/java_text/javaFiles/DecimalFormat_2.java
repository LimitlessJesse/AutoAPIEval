import java.text.DecimalFormat;
import java.text.FieldPosition;

public class DecimalFormat_2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        StringBuffer result = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        double number = 12345.67;
        
        String formattedNumber = df.format(number, result, fieldPosition).toString();
        System.out.println("Formatted Number: " + formattedNumber);
        System.out.println("Field Position: " + fieldPosition);
    }
}
