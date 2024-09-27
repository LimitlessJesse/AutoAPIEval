import java.lang.Enum;

enum Color {
    RED, GREEN, BLUE;
}

public class Enum_1 {
    public static void main(String[] args) {
        System.out.println(Color.RED.name());
        System.out.println(Color.GREEN.name());
        System.out.println(Color.BLUE.name());
    }
}
