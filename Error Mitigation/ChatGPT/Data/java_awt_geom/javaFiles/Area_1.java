import java.awt.geom.Area;

public class Area_1 {
    public static void main(String[] args) {
        Area a1 = new Area(); // Create a new Area object
        Area a2 = new Area(); // Create another Area object

        // Define the shapes of the Area objects
        a1.add(new Area(/* Define the shape of the first Area object */));
        a2.add(new Area(/* Define the shape of the second Area object */));

        // Add the shape of the second Area object to the first Area object
        a1.add(a2);

        // Print the resulting shape of the first Area object
        System.out.println(a1);
    }
}
