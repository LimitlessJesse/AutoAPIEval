import java.text.ChoiceFormat;

public class ChoiceFormat_4 {
    public static void main(String[] args) {
        ChoiceFormat choiceFormat = new ChoiceFormat("1#one|2#two|3#three");
        String pattern = choiceFormat.toPattern();
        System.out.println("Pattern: " + pattern);
    }
}
