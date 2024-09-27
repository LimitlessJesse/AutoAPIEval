import java.lang.Character;

public class Character_3 {
    public static void main(String[] args) {
        char ch = 'a';
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("Is '" + ch + "' a letter or digit? " + isLetterOrDigit);
    }
}
