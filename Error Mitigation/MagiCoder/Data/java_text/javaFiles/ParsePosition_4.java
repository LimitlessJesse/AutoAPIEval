import java.text.ParsePosition;

public class ParsePosition_4 {
    public static void main(String[] args) {
        ParsePosition pos = new ParsePosition(0);
        System.out.println(pos.getIndex()); // Output: 0

        // Assume we have a string "123"
        String str = "123";
        int result = Integer.parseInt(str, 10, pos, null);
        System.out.println(result); // Output: 123
        System.out.println(pos.getIndex()); // Output: 3
    }
}
