import java.awt.geom.FlatteningPathIterator;

public class FlatteningPathIterator_1 {
    public static void main(String[] args) {
        float[] coords = {100, 100, 200, 200, 300, 300};
        int[] types = {FlatteningPathIterator.SEG_MOVETO, FlatteningPathIterator.SEG_LINETO, FlatteningPathIterator.SEG_CLOSE};
        FlatteningPathIterator pathIterator = new FlatteningPathIterator(new java.awt.geom.GeneralPath(types, coords), 0.5);
        int windingRule = pathIterator.getWindingRule();
        System.out.println("Winding Rule: " + windingRule);
    }
}
