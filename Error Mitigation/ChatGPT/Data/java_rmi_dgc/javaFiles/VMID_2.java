import java.rmi.dgc.VMID;

public class VMID_2 {
    public static void main(String[] args) {
        VMID vmid1 = new VMID();
        VMID vmid2 = new VMID();

        System.out.println("VMID 1: " + vmid1);
        System.out.println("VMID 2: " + vmid2);

        boolean areEqual = vmid1.equals(vmid2);
        System.out.println("Are VMID 1 and VMID 2 equal? " + areEqual);
    }
}
