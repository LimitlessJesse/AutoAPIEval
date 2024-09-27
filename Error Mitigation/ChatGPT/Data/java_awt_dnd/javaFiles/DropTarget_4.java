import java.awt.dnd.DropTarget;

public class DropTarget_4 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        dropTarget.setDefaultActions(DnDConstants.ACTION_COPY_OR_MOVE);
    }
}
