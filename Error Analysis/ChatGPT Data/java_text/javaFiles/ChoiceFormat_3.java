import java.text.ChoiceFormat;

public class ChoiceFormat_3 {
    public static void main(String[] args) {
        double[] limits = {1, 2, 3};
        String[] grades = {"A", "B", "C", "D"};
        
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, grades);
        System.out.println("Original: " + choiceFormat.format(2));
        
        choiceFormat.applyPattern("0#F|1#D|2#C|3#B|4#A");
        System.out.println("Updated: " + choiceFormat.format(2));
    }
}
