import javax.naming.directory.ModificationItem;

public class ModificationItem_1 {
    public static void main(String[] args) {
        ModificationItem modificationItem = new ModificationItem(ModificationItem.ADD_ATTRIBUTE, null);
        int op = modificationItem.getModificationOp();
        System.out.println("Modification operation: " + op);
    }
}
