import java.text.ChoiceFormat;
import java.util.Arrays;

public class ChoiceFormat_4 {
    public static void main(String[] args) {
        double[] limits = {1, 2, 3, 4}; 
        String[] formats = {"One", "Two", "Three", "Four"};
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);
        
        Object[] formatArray = choiceFormat.getFormats();
        
        System.out.println("Formats:");
        System.out.println(Arrays.toString(formatArray));
    }
}
