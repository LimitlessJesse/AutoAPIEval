import javax.naming.directory.ModificationItem;
import javax.naming.directory.DirContext;

public class ModificationItem_1 {
    public static void main(String[] args) {
        ModificationItem modificationItem = new ModificationItem(DirContext.ADD_ATTRIBUTE, null);
        int modificationOp = modificationItem.getModificationOp();
        System.out.println("Modification code: " + modificationOp);
    }
}
