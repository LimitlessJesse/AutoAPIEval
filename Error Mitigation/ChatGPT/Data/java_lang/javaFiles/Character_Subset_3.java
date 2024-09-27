import java.lang.Character;

public class Character_Subset_3 {
    public static void main(String[] args) {
        Character.Subset subset = new Character.Subset() {
            @Override
            public String toString() {
                return "Latin-1 Supplement";
            }
        };
        
        System.out.println(subset.toString());
    }
}
