import java.lang.Character;

public class Character_1 {
    public static void main(String[] args) {
        char ch = 'A';
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is " + ch + " a letter? " + isLetter);
    }
}
