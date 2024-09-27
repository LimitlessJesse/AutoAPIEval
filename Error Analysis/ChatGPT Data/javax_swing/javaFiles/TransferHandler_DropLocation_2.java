import javax.swing.TransferHandler;
import java.awt.Point;

public class TransferHandler_DropLocation_2 {
    public static void main(String[] args) {
        TransferHandler.DropLocation dropLocation = new TransferHandler.DropLocation(new Point(10, 10), 1, 2);
        Point dropPoint = dropLocation.getDropPoint();
        System.out.println("Drop Point: " + dropPoint);
    }
}
