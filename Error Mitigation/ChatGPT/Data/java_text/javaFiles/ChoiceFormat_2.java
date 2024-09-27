import java.text.ChoiceFormat;

public class ChoiceFormat_2 {
    public static void main(String[] args) {
        double[] limits = {1, 2, 3, 4};
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, new String[]{"1", "2", "3", "4"});
        
        double[] retrievedLimits = choiceFormat.getLimits();
        
        for (double limit : retrievedLimits) {
            System.out.println(limit);
        }
    }
}
