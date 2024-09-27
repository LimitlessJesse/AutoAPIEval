import java.util.regex.Pattern;

public class Pattern_3 {
    public static void main(String[] args) {
        String text = "apple,orange,banana,grape";
        String[] fruits = Pattern.compile(",").split(text);
        
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
