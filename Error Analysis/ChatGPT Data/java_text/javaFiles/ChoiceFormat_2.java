import java.text.ChoiceFormat;

public class ChoiceFormat_2 {
    public static void main(String[] args) {
        ChoiceFormat choiceFormat = new ChoiceFormat("1#one|2#two|3#three");
        System.out.println(choiceFormat.toPattern());
    }
}
