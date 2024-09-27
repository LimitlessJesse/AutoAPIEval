import java.rmi.dgc.VMID;

public class VMID_3 {
    public static void main(String[] args) {
        VMID vmid1 = new VMID();
        VMID vmid2 = new VMID();

        boolean isEqual = vmid1.equals(vmid2);
        System.out.println("Are the VMIDs equal? " + isEqual);
    }
}
