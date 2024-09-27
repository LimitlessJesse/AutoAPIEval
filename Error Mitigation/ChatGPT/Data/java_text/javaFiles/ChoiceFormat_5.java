import java.text.ChoiceFormat;

public class ChoiceFormat_5 {
    public static void main(String[] args) {
        ChoiceFormat cf = new ChoiceFormat(new double[]{1,2,3}, new String[]{"one","two","three"});
        ChoiceFormat clone = (ChoiceFormat) cf.clone();
        System.out.println("Original: " + cf.format(2));
        System.out.println("Clone: " + clone.format(2));
    }
}
