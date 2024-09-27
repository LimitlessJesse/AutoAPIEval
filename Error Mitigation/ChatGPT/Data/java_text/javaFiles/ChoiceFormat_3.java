import java.text.ChoiceFormat;

public class ChoiceFormat_3 {
    public static void main(String[] args) {
        double[] limits = {1, 2, 3, 4};
        String[] formats = {"one", "two", "three", "four"};
        
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);
        
        double number = 2.5;
        System.out.println("Formatted number: " + choiceFormat.format(number));
    }
}
