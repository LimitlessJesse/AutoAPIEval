import java.lang.Character;

public class Character_Subset_2 {
    public static void main(String[] args) {
        Character.Subset subset = new Character.Subset() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        
        int hash = subset.hashCode();
        System.out.println("Hash code: " + hash);
    }
}
