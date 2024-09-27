import java.util.EnumMap;

public class EnumMap_2 {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        EnumMap<Color, String> colorMap = new EnumMap<>(Color.class);
        colorMap.put(Color.RED, "FF0000");
        colorMap.put(Color.GREEN, "00FF00");

        System.out.println(colorMap.get(Color.RED)); // Output: FF0000
        System.out.println(colorMap.get(Color.GREEN)); // Output: 00FF00
        System.out.println(colorMap.get(Color.BLUE)); // Output: null
    }
}
