import java.lang.Character;

public class Character_3 {
    public static void main(String[] args) {
        char ch ='';
        boolean isWhitespace = Character.isWhitespace(ch);
        System.out.println("Is '" + ch + "' a whitespace character? " + isWhitespace);
    }
}
