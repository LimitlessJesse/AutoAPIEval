import java.awt.dnd.DropTarget;

public class DropTarget_4 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        int actions = DnDConstants.ACTION_COPY_OR_MOVE;
        dropTarget.setDefaultActions(actions);
    }
}
