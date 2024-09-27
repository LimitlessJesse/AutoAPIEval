import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class EtchedBorder_3 {
    public static void main(String[] args) {
        EtchedBorder etchedBorder = new EtchedBorder(EtchedBorder.RAISED);
        int etchType = etchedBorder.getEtchType();
        System.out.println("Etch Type: " + etchType);
    }
}
