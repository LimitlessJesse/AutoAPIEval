import java.text.ChoiceFormat;

public class ChoiceFormat_1 {
    public static void main(String[] args) {
        ChoiceFormat choiceFormat = new ChoiceFormat("1#one|2#two|3#three");
        System.out.println("Pattern before applying: " + choiceFormat.toPattern());
        
        choiceFormat.applyPattern("4#four|5#five|6#six");
        System.out.println("Pattern after applying: " + choiceFormat.toPattern());
    }
}
