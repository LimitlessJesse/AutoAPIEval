import javax.swing.Box;

public class Box_Filler_2 {
    public static void main(String[] args) {
        Box.Filler filler = new Box.Filler(new Dimension(10, 10), new Dimension(20, 20), new Dimension(30, 30));
        filler.changeShape(new Dimension(5, 5), new Dimension(15, 15), new Dimension(25, 25));
    }
}
