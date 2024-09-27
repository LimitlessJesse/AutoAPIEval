import java.awt.geom.Path2D;

public class Path2D_7 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.append(new double[]{0, 0, 10, 10}, new int[]{Path2D.WIND_EVEN_ODD, 0, 1, 1}, 4);
        boolean contains = path.contains(5, 5);
        System.out.println(contains);  // Output: true
    }
}
